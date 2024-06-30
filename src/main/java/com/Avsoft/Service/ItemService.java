package com.Avsoft.Service;

import java.util.List;

import com.Avsoft.Model.MedicineItem;

public interface ItemService {

	MedicineItem createMedicineItem(MedicineItem medicineItem);

	MedicineItem getMedicineItemById(Long id);

	List<MedicineItem> getAllMedicineItems();

	MedicineItem updateMedicineItem(Long id, MedicineItem medicineItem);

	void deleteMedicineItem(Long id);
}
