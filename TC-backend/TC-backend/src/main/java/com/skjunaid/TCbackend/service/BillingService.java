package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Billing;

import java.util.List;

public interface BillingService {
    public Billing saveBilling(Billing billing);

    public List<Billing> fetchBillingList();

    public void deleteBilling(Long billingId);


    public Billing updateBilling(Billing billing);
}
