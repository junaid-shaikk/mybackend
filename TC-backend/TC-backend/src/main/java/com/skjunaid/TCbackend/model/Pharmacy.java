package com.skjunaid.TCbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Pharmacy {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String medication_name;
    private String dosage;
    private LocalDate refill_date;
    private String prescription_number;
    private Long patientId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getMedication_name() {
        return medication_name;
    }

    public void setMedication_name(String medication_name) {
        this.medication_name = medication_name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public LocalDate getRefill_date() {
        return refill_date;
    }

    public void setRefill_date(LocalDate refill_date) {
        this.refill_date = refill_date;
    }

    public String getPrescription_number() {
        return prescription_number;
    }

    public void setPrescription_number(String prescription_number) {
        this.prescription_number = prescription_number;
    }

    public Pharmacy(Long id, Long patientId, String medication_name, String dosage, LocalDate refill_date, String prescription_number) {
        id = id;
        this.patientId = patientId;
        this.medication_name = medication_name;
        this.dosage = dosage;
        this.refill_date = refill_date;
        this.prescription_number = prescription_number;
    }

    public Pharmacy() {
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "Id=" + id +
                ", patientId=" + patientId +
                ", medication_name='" + medication_name + '\'' +
                ", dosage='" + dosage + '\'' +
                ", refill_date=" + refill_date +
                ", prescription_number='" + prescription_number + '\'' +
                '}';
    }
}
