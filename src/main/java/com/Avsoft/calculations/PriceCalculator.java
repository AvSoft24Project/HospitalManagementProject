package com.Avsoft.calculations;

import java.util.List;

import com.Avsoft.Model.MedicineItem;

public class PriceCalculator {
	public Double calculateTotalPrice(List<MedicineItem> medicineItems) {
		Double totalMRP = 0.0;

		for (MedicineItem item : medicineItems) {
			Double itemTotalMRP = item.getTotalMRP() * item.getQuantity();
			totalMRP += itemTotalMRP;
		}
		return totalMRP;
	}
}