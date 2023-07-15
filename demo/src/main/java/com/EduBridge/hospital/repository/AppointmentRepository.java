package com.EduBridge.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EduBridge.hospital.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
