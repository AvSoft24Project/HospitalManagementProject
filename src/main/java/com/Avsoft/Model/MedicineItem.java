package com.Avsoft.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine_item")

public class MedicineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private MedicineOrder medicineOrder;

	private String medicineName;

	private Integer quantity;

	private Double totalMRP;

	private Integer stripSize;

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MedicineOrder getMedicineOrder() {
		return medicineOrder;
	}

	public void setMedicineOrder(MedicineOrder medicineOrder) {
		this.medicineOrder = medicineOrder;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalMRP() {
		return totalMRP;
	}

	public void setTotalMRP(Double totalMRP) {
		this.totalMRP = totalMRP;
	}

	public Integer getStripSize() {
		return stripSize;
	}

	public void setStripSize(Integer stripSize) {
		this.stripSize = stripSize;
	}

	@Override
	public String toString() {
		return "MedicineItem [id=" + id + ", medicineOrder=" + medicineOrder + ", medicineName=" + medicineName
				+ ", quantity=" + quantity + ", totalMRP=" + totalMRP + ", stripSize=" + stripSize + "]";
	}

}
