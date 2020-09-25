package com.dsi.si.provadsi.provadsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsi.si.provadsi.provadsi.repositories.CareRepository;

@Service
public class CareService {

	@Autowired
	private CareRepository repo;
	
}
