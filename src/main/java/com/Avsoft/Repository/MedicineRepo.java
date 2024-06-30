package com.Avsoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Avsoft.Model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Long> {

}