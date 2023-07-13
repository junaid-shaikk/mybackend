package com.skjunaid.TCbackend.repository;

import com.skjunaid.TCbackend.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    public Staff getStaffById(Long staffId);
}
