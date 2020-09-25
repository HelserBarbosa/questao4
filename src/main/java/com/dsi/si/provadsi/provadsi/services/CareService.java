package com.dsi.si.provadsi.provadsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.si.provadsi.provadsi.models.Care;
import com.dsi.si.provadsi.provadsi.repositories.CareRepository;

@Service
public class CareService {

	@Autowired
	private CareRepository repo;
	
	public Care getOneCare(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException());
	}

	public Care save(Care care) {
		return repo.save(care);
	}
	
	public List<Care> getAll(){
		return repo.findAll();
	}
	
}
