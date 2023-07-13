package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Pharmacy;
import com.skjunaid.TCbackend.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService{

    @Autowired
    private PharmacyRepository pharmacyRepository;

    @Override
    public Pharmacy savePharmacy(Pharmacy pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }

    @Override
    public List<Pharmacy> fetchPharmacyList() {
        return pharmacyRepository.findAll();
    }

    @Override
    public void deletePharmacy(Long pharmacyId) {
        pharmacyRepository.deleteById(pharmacyId);
    }

    @Override
    public Pharmacy updatePharmacy(Pharmacy pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }
}
