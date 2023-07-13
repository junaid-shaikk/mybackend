package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.MedicalRecord;
import com.skjunaid.TCbackend.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService{

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    @Override
    public List<MedicalRecord> fetchMedicalRecordList() {
        return medicalRecordRepository.findAll();
    }

    @Override
    public void deleteMedicalRecordById(Long medicalRecordId) {
        medicalRecordRepository.deleteById(medicalRecordId);
    }

    @Override
    public MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    @Override
    public MedicalRecord getMedicalRecordById(Long medicalRecordId) {
        return medicalRecordRepository.getMedicalRecordById(medicalRecordId);
    }
}
