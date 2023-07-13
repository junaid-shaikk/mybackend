package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Patient;

import java.util.List;

public interface PatientService {

    public Patient savePatient(Patient patient);

    public List<Patient> fetchPatientList();

    public Patient fetchPatientById(Long patientId);


    public void deletePatientById(Long patientId);

    public Patient updatePatient(Long patientId, Patient patient);
}
