package com.Avsoft.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Avsoft.Model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine, Long> {
	
}