package com.skjunaid.TCbackend.controller;

//import com.skjunaid.TCbackend.error.ResourceNotFoundException;
import com.skjunaid.TCbackend.model.Staff;
import com.skjunaid.TCbackend.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping("/staff")
    public Staff saveStaff(@RequestBody Staff staff){
        return staffService.saveStaff(staff);
    }

//    @GetMapping("/staff")
//    public List<Staff> fetchStaffList(){
//        return staffService.fetchStaffList();
//    }

    @DeleteMapping("/staff")
    public String deleteStaff(@RequestParam("id") Long staffId){
        staffService.deleteStaff(staffId);
        return "Deleted";
    }

    @PutMapping("/staff")
    public Staff updateStaff(@RequestBody Staff staff){
        return staffService.updateStaff(staff);
    }

//    @GetMapping("/staff")
//    public Staff getStaffById(@RequestParam("id") Long staffId) {
//        return staffService.getStaffById(staffId);
//    }
}
