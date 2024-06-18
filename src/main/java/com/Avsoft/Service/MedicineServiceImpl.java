package com.Avsoft.Service;

import com.Avsoft.Model.Medicine;
import com.Avsoft.Repository.MedicineRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepo medicineRepo;

	@Override
	public Medicine createMedicine(Medicine medicine) {
		return medicineRepo.save(medicine);
	}

	@Override
	public Medicine getMedicineById(Long batch_id) {
		return medicineRepo.findById(batch_id).orElse(null);
	}

	@Override
	public List<Medicine> getAllMedicines() {
		return medicineRepo.findAll();
	}

	@Override
	public void deleteMedicine(Long batch_id) {
		medicineRepo.deleteById(batch_id);
	}
}
