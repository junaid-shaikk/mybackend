package com.skjunaid.TCbackend.controller;

import com.skjunaid.TCbackend.model.Appointment;
import com.skjunaid.TCbackend.model.MedicalRecord;
import com.skjunaid.TCbackend.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @PostMapping("/medical-records")
    public MedicalRecord saveMedicalRecord(@RequestBody MedicalRecord medicalRecord){
        return medicalRecordService.saveMedicalRecord(medicalRecord);
    }

//    @GetMapping("/medical-records")
//    public List<MedicalRecord> fetchMedicalRecordList(){
//        return medicalRecordService.fetchMedicalRecordList();
//    }

    @DeleteMapping("/medical-records")
    public String deleteMedicalRecordById(@RequestParam("id") Long medicalRecordId){
        medicalRecordService.deleteMedicalRecordById(medicalRecordId);
        return "Deleted";
    }

    @PutMapping("/medical-records")
    public MedicalRecord updateMedicalRecord(@RequestBody MedicalRecord medicalRecord){
        return medicalRecordService.updateMedicalRecord(medicalRecord);
    }

    @GetMapping("/medical-records")
    public MedicalRecord getMedicalRecordById(@RequestParam("id") Long medicalRecordId){
        return medicalRecordService.getMedicalRecordById(medicalRecordId);
    }
}
