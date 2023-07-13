package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.MedicalRecord;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MedicalRecordService {
    public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord);

    public List<MedicalRecord> fetchMedicalRecordList();

    public void deleteMedicalRecordById(Long medicalRecordId);

    public MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord);

    public MedicalRecord getMedicalRecordById(Long medicalRecordId);
}
