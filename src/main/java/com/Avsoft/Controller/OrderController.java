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

import com.Avsoft.Model.MedicineOrder;
import com.Avsoft.Service.OrderService;

@RestController
@RequestMapping("/medicine-orders")
public class OrderController {
	@Autowired
	private OrderService medicineOrderService;

	@PostMapping
	public ResponseEntity<MedicineOrder> createMedicineOrder(@RequestBody MedicineOrder medicineOrder) {
		return new ResponseEntity<>(medicineOrderService.createMedicineOrder(medicineOrder), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<MedicineOrder> getMedicineOrderById(@PathVariable Long id) {
		return new ResponseEntity<>(medicineOrderService.getMedicineOrderById(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<MedicineOrder>> getAllMedicineOrders() {
		return new ResponseEntity<>(medicineOrderService.getAllMedicineOrders(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<MedicineOrder> updateMedicineOrder(@PathVariable Long id,
			@RequestBody MedicineOrder medicineOrder) {
		return new ResponseEntity<>(medicineOrderService.updateMedicineOrder(id, medicineOrder), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMedicineOrder(@PathVariable Long id) {
		medicineOrderService.deleteMedicineOrder(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}