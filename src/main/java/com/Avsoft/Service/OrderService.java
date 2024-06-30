package com.Avsoft.Service;

import java.util.List;

import com.Avsoft.Model.MedicineOrder;

public interface OrderService {

	MedicineOrder createMedicineOrder(MedicineOrder medicineOrder);

	MedicineOrder getMedicineOrderById(Long orderId);

	List<MedicineOrder> getAllMedicineOrders();

	MedicineOrder updateMedicineOrder(Long orderId, MedicineOrder medicineOrder);

	void deleteMedicineOrder(Long orderId);

//	void calculatorOrderTotalMRP(OrderDTO medicineOrderDTO);
}