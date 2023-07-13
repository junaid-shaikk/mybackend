package com.skjunaid.TCbackend.controller;

import com.skjunaid.TCbackend.model.Pharmacy;
import com.skjunaid.TCbackend.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    @PostMapping("/pharmacy")
    public Pharmacy savePharmacy(@RequestBody Pharmacy pharmacy){
        return pharmacyService.savePharmacy(pharmacy);
    }

    @GetMapping("/pharmacy")
    public List<Pharmacy> fetchPharmacyList(){
        return pharmacyService.fetchPharmacyList();
    }

    @DeleteMapping("/pharmacy")
    public String deletePharmacy(@RequestParam("id") Long pharmacyId){
        pharmacyService.deletePharmacy(pharmacyId);
        return "Deleted";
    }

    @PutMapping("/pharmacy")
    public Pharmacy updatePharmacy(@RequestBody Pharmacy pharmacy){
        return pharmacyService.updatePharmacy(pharmacy);
    }
}
