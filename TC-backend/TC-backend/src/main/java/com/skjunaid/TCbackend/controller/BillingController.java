package com.skjunaid.TCbackend.controller;

import com.skjunaid.TCbackend.model.Billing;
import com.skjunaid.TCbackend.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping("/billing")
    public Billing saveBilling(@RequestBody Billing billing){
        return billingService.saveBilling(billing);
    }

    @GetMapping("/billing")
    public List<Billing> fetchBillingList(){
        return billingService.fetchBillingList();
    }

    @DeleteMapping("/billing")
    public String deleteBilling(@RequestParam("id") Long billingId){
        billingService.deleteBilling(billingId);
        return "deleted";
    }

    @PutMapping("/billing")
    public Billing updateBilling(@RequestBody Billing billing){
        return billingService.updateBilling(billing);
    }
}
