package com.skjunaid.TCbackend.model;

import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;
    private Long amount;
    private String treatment_description;
    private Long patientId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getTreatment_description() {
        return treatment_description;
    }

    public void setTreatment_description(String treatment_description) {
        this.treatment_description = treatment_description;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Billing(Long id, LocalDate date, Long amount, String treatment_description, Long patientId) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.treatment_description = treatment_description;
        this.patientId = patientId;
    }

    public Billing() {
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                ", treatment_description='" + treatment_description + '\'' +
                ", patientId=" + patientId +
                '}';
    }
}
