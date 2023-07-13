package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Billing;
import com.skjunaid.TCbackend.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingServiceImpl implements BillingService{

    @Autowired
    private BillingRepository billingRepository;

    @Override
    public Billing saveBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    @Override
    public List<Billing> fetchBillingList() {
        return billingRepository.findAll();
    }

    @Override
    public void deleteBilling(Long billingId) {
        billingRepository.deleteById(billingId);
    }

    @Override
    public Billing updateBilling(Billing billing) {
        return billingRepository.save(billing);
    }


}
