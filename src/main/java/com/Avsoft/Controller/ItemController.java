package com.Avsoft.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Avsoft.Model.MedicineItem;
import com.Avsoft.Service.ItemService;

@RestController
@RequestMapping("/medicine-items")
public class ItemController {

	@Autowired
	private ItemService medicineItemService;

	@PostMapping
	public ResponseEntity<MedicineItem> createMedicineItem(@RequestBody MedicineItem medicineItem) {
		return new ResponseEntity<>(medicineItemService.createMedicineItem(medicineItem), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<MedicineItem> getMedicineItemById(@PathVariable Long id) {
		return new ResponseEntity<>(medicineItemService.getMedicineItemById(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<MedicineItem>> getAllMedicineItems() {
		return new ResponseEntity<>(medicineItemService.getAllMedicineItems(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<MedicineItem> updateMedicineItem(@PathVariable Long id,
			@RequestBody MedicineItem medicineItem) {
		return new ResponseEntity<>(medicineItemService.updateMedicineItem(id, medicineItem), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMedicineItem(@PathVariable Long id) {
		medicineItemService.deleteMedicineItem(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
