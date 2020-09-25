package com.dsi.si.provadsi.provadsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.si.provadsi.provadsi.models.SuporttedPeople;
import com.dsi.si.provadsi.provadsi.services.SuporttedPeopleService;

@RestController("suportted-people")
public class SuporttedPeopleController {

	@Autowired
	private SuporttedPeopleService service;
	
}
