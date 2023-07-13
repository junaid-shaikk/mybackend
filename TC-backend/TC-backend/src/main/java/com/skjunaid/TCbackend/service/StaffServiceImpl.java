package com.skjunaid.TCbackend.service;

//import com.skjunaid.TCbackend.error.ResourceNotFoundException;
import com.skjunaid.TCbackend.model.Staff;
import com.skjunaid.TCbackend.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff saveStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public List<Staff> fetchStaffList() {
        return staffRepository.findAll();
    }

    @Override
    public void deleteStaff(Long staffId) {
        staffRepository.deleteById(staffId);
    }

    @Override
    public Staff updateStaff(Staff staff) {
        return staffRepository.save(staff);
    }

//    @Override
//    public Staff getStaffById(Long staffId) {
//        Optional<Staff> staff= staffRepository.findById(staffId);
//
//        if (!staff.isPresent()){
//            throw new ResourceNotFoundException("Staff not available");
//        }
//        return staff.get();
//    }
}
