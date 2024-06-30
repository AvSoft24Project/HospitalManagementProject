package com.Avsoft.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Avsoft.Exception.ResourceNotFoundException;
import com.Avsoft.Model.MedicineItem;
import com.Avsoft.Model.MedicineOrder;

import com.Avsoft.Repository.ItemRepository;
import com.Avsoft.Repository.OrderRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository medicineItemRepository;

	@Autowired
	private OrderRepository medicineOrderRepository;

	@Override
	public MedicineItem createMedicineItem(MedicineItem medicineItem) {
		MedicineOrder medicineOrder = medicineOrderRepository.findById(medicineItem.getId())
				.orElseThrow(() -> new ResourceNotFoundException("MedicineOrder not found"));

		medicineItem.setMedicineOrder(medicineOrder);
		return medicineItemRepository.save(medicineItem);
	}

	@Override
	public MedicineItem getMedicineItemById(Long id) {
		return medicineItemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("MedicineItem not found"));
	}

	@Override
	public List<MedicineItem> getAllMedicineItems() {
		return medicineItemRepository.findAll();
	}

	@Override
	public MedicineItem updateMedicineItem(Long id, MedicineItem medicineItem) {
		MedicineItem existingItem = medicineItemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("MedicineItem not found"));

		// Update fields from the provided medicineItem object
		existingItem.setId(medicineItem.getId());
		existingItem.setMedicineName(medicineItem.getMedicineName());
		existingItem.setTotalMRP(medicineItem.getTotalMRP());
		existingItem.setQuantity(medicineItem.getQuantity());

		// existingItem.setExpiryDate(medicineItem.getExpiryDate());

		return medicineItemRepository.save(existingItem);
	}

	@Override
	public void deleteMedicineItem(Long id) {
		MedicineItem existingItem = medicineItemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("MedicineItem not found"));
		medicineItemRepository.delete(existingItem);
	}
}
