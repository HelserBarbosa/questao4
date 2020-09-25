package com.dsi.si.provadsi.provadsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsi.si.provadsi.provadsi.models.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{

}
