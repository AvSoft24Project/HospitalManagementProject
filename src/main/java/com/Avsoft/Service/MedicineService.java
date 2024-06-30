package com.Avsoft.Service;

import java.util.List; 

import com.Avsoft.Model.Medicine;

public interface MedicineService {

	Medicine createMedicine(Medicine medicine);

	Medicine getMedicineById(Long batch_id);

	List<Medicine> getAllMedicines();

	void deleteMedicine(Long batch_id);
}
