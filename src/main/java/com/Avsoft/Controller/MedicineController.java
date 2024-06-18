package com.Avsoft.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Avsoft.Model.Medicine;
import com.Avsoft.Service.MedicineService;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@PostMapping
	public ResponseEntity<Medicine> createMedicine(@RequestBody Medicine medicine) {
		Medicine savedMedicine = medicineService.createMedicine(medicine);
		return ResponseEntity.ok(savedMedicine);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Medicine> getMedicineById(@PathVariable("id") Long id) {
		Medicine medicine = medicineService.getMedicineById(id);
		if (medicine != null) {
			return ResponseEntity.ok(medicine);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}