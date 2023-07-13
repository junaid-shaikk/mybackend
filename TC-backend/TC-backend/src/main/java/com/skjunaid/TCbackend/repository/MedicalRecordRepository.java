package com.skjunaid.TCbackend.repository;

import com.skjunaid.TCbackend.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

    public MedicalRecord getMedicalRecordById(Long medicalRecordId);
}
