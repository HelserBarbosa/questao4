package com.dsi.si.provadsi.provadsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.si.provadsi.provadsi.repositories.StaffTypeRepository;

@Service
public class StaffTypeService {

	@Autowired
	private StaffTypeRepository repo;
	
	
}
