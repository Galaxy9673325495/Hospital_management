package com.EduBridge.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EduBridge.hospital.model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
