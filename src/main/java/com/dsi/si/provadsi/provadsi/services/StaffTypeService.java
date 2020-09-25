package com.dsi.si.provadsi.provadsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.si.provadsi.provadsi.models.StaffType;
import com.dsi.si.provadsi.provadsi.repositories.StaffTypeRepository;

@Service
public class StaffTypeService {

	@Autowired
	private StaffTypeRepository repo;
	
	public StaffType findOne(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException());
	}
	
	public StaffType save(StaffType staffType) {
		return repo.save(staffType);
	}
	
	public List<StaffType> findAll(){
		return repo.findAll();
	}
}
