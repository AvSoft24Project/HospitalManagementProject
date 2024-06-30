package com.Avsoft.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine_order")

public class MedicineOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long orderId;

	private Double totalMRP;

	private String status;

	private String orderType;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getTotalMRP() {
		return totalMRP;
	}

	public void setTotalMRP(Double totalMRP) {
		this.totalMRP = totalMRP;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Override
	public String toString() {
		return "MedicineOrder [orderId=" + orderId + ", totalMRP=" + totalMRP + ", status=" + status + ", orderType="
				+ orderType + "]";
	}

}
