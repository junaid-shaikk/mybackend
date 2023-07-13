package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Patient;
import com.skjunaid.TCbackend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> fetchPatientList() {
        return patientRepository.findAll();
    }

    @Override
    public Patient fetchPatientById(Long patientId) {
        return patientRepository.findById(patientId).get();
    }

    @Override
    public void deletePatientById(Long patientId) {
        patientRepository.deleteById(patientId);
    }

    @Override
    public Patient updatePatient(Long patientId, Patient patient) {
        Patient patientDB= patientRepository.findById(patientId).get();

        if(Objects.nonNull(patient.getName()) &&
        !"".equalsIgnoreCase(patient.getName())){
            patientDB.setName(patient.getName());
        }

        if(Objects.nonNull(patient.getAge()) &&
                !"".equalsIgnoreCase(String.valueOf(patient.getAge()))){
            patientDB.setAge(patient.getAge());
        }

        if(Objects.nonNull(patient.getGender()) &&
                !"".equalsIgnoreCase(patient.getGender())){
            patientDB.setGender(patient.getGender());
        }

        if(Objects.nonNull(patient.getAddress()) &&
                !"".equalsIgnoreCase(patient.getAddress())){
            patientDB.setAddress(patient.getAddress());
        }

        if(Objects.nonNull(patient.getPhone()) &&
                !"".equalsIgnoreCase(patient.getPhone())){
            patientDB.setPhone(patient.getPhone());
        }

        if(Objects.nonNull(patient.getEmail()) &&
                !"".equalsIgnoreCase(patient.getEmail())){
            patientDB.setEmail(patient.getEmail());
        }

        if(Objects.nonNull(patient.getMedicalHistory()) &&
                !"".equalsIgnoreCase(patient.getMedicalHistory())){
            patientDB.setMedicalHistory(patient.getMedicalHistory());
        }

        if(Objects.nonNull(patient.getTreatmentPlan()) &&
                !"".equalsIgnoreCase(patient.getTreatmentPlan())){
            patientDB.setTreatmentPlan(patient.getTreatmentPlan());
        }
        return patientRepository.save(patientDB);
    }
}

