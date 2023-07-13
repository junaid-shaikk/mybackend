package com.skjunaid.TCbackend.service;

import com.skjunaid.TCbackend.model.Staff;

import java.util.List;

public interface StaffService {
    public Staff saveStaff(Staff staff);

    public List<Staff> fetchStaffList();

    public void deleteStaff(Long staffId);

    public Staff updateStaff(Staff staff);

//    public Staff getStaffById(Long staffId);
}
