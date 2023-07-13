package com.skjunaid.TCbackend.controller;


import com.skjunaid.TCbackend.model.Appointment;
import com.skjunaid.TCbackend.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/appointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointmentService.saveAppointment(appointment);
    }

    @GetMapping("/appointment")
    public List<Appointment> fetchAppointmentList(){
        return appointmentService.fetchAppointmentList();
    }

    @GetMapping("/appointment/doctorId")
    public List<Appointment> fetchAppointmentsByDoctorId(@RequestParam("doctorId") Long doctorId) {
        return appointmentService.fetchAppointmentsByDoctorId(doctorId);
    }

    @GetMapping("/appointment/patientId")
    public List<Appointment> fetchAppointmentsByPatientId(@RequestParam("patientId") Long patientId) {
        return appointmentService.fetchAppointmentsByPatientId(patientId);
    }

    @DeleteMapping("/appointment")
    public String deleteAppointment(@RequestParam("appointmentId") Long appointmentId) {
        appointmentService.deleteAppointment(appointmentId);
        return "Deleted Successfully";
    }

    @PutMapping("/appointment")
    public Appointment updateAppointment(@RequestBody Appointment appointment) {
        return appointmentService.updateAppointment(appointment);
    }

}
