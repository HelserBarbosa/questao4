package com.dsi.si.provadsi.provadsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsi.si.provadsi.provadsi.models.Care;

@Repository
public interface CareRepository extends JpaRepository<Care, Long> {

}
