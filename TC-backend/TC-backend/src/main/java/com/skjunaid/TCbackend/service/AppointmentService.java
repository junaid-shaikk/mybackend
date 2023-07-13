package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Appointment;

import java.util.List;

public interface AppointmentService {
    public Appointment saveAppointment(Appointment appointment);

    public List<Appointment> fetchAppointmentList();


    public List<Appointment> fetchAppointmentsByDoctorId(Long doctorId);

    public List<Appointment> fetchAppointmentsByPatientId(Long patientId);

    public void deleteAppointment(Long appointmentId);

    public Appointment updateAppointment(Appointment appointment);

}
