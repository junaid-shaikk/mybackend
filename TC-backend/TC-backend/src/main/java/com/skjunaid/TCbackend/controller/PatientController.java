package com.skjunaid.TCbackend.controller;

import com.skjunaid.TCbackend.model.Patient;
import com.skjunaid.TCbackend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    public Patient savePatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }


    @GetMapping("/patient")
    public List<Patient> fetchPatientList(){
        return patientService.fetchPatientList();
    }


    @GetMapping("/patient/id")
    public Patient fetchPatientById(@RequestParam("id") Long patientId){
        return patientService.fetchPatientById(patientId);
    }


    @DeleteMapping("/patient/id")
    public String deletePatientById(@RequestParam("id") Long patientId){
        patientService.deletePatientById(patientId);
        return "Deleted Successfully";
    }


    @PutMapping("/patient/{id}")
    public Patient updatePatient(@PathVariable("id") Long patientId, @RequestBody Patient patient){
        return patientService.updatePatient(patientId, patient);
    }

}
