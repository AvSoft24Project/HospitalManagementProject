package com.Avsoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Avsoft.Model.MedicineOrder;

public interface OrderRepository extends JpaRepository<MedicineOrder, Long> {
}