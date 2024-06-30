package com.Avsoft.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Avsoft.Exception.ResourceNotFoundException;

import com.Avsoft.Model.Medicine;
import com.Avsoft.Model.MedicineItem;
import com.Avsoft.Model.MedicineOrder;
import com.Avsoft.Repository.MedicineRepo;
import com.Avsoft.Repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository medicineOrderRepository;

	@Autowired
	private MedicineRepo medicineRepo;

	@Override
	public MedicineOrder createMedicineOrder(MedicineOrder medicineOrder) {
		return medicineOrderRepository.save(medicineOrder);
	}

	@Override
	public MedicineOrder getMedicineOrderById(Long orderId) {
		return medicineOrderRepository.findById(orderId)
				.orElseThrow(() -> new ResourceNotFoundException("MedicineOrder not found"));
	}

	@Override
	public List<MedicineOrder> getAllMedicineOrders() {
		return medicineOrderRepository.findAll();
	}

	@Override
	public MedicineOrder updateMedicineOrder(Long orderId, MedicineOrder medicineOrder) {
		MedicineOrder existingOrder = medicineOrderRepository.findById(orderId)
				.orElseThrow(() -> new ResourceNotFoundException("MedicineOrder not found"));

		// Update fields from the provided medicineOrder object
		existingOrder.setOrderId(medicineOrder.getOrderId());
		existingOrder.setStatus(medicineOrder.getStatus());
		existingOrder.setOrderType(medicineOrder.getOrderType());
		existingOrder.setTotalMRP(medicineOrder.getTotalMRP());
		

		return medicineOrderRepository.save(existingOrder);
	}

	@Override
	public void deleteMedicineOrder(Long orderId) {
		MedicineOrder existingOrder = medicineOrderRepository.findById(orderId)
				.orElseThrow(() -> new ResourceNotFoundException("MedicineOrder not found"));
		medicineOrderRepository.delete(existingOrder);
	}

	public void calculateOrderTotalMRP(MedicineItem medicineItem) {
		Medicine medicine = medicineRepo.findById(medicineItem.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Medicine not found with ID " + medicineItem.getId()));
		double itemTotalMRP = medicine.getMrp() * medicineItem.getQuantity();
		medicineItem.setTotalMRP(itemTotalMRP);
	}
}