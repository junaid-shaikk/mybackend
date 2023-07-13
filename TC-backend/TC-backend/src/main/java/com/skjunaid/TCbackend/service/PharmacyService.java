package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Pharmacy;

import java.util.List;

public interface PharmacyService {
    public Pharmacy savePharmacy(Pharmacy pharmacy);

    public List<Pharmacy> fetchPharmacyList();

    public void deletePharmacy(Long pharmacyId);

    public Pharmacy updatePharmacy(Pharmacy pharmacy);
}
