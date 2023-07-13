package com.skjunaid.TCbackend.repository;

import com.skjunaid.TCbackend.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    public List<Appointment> findByDoctorId(Long doctorId);

    public List<Appointment> findByPatientId(Long patientId);
}
