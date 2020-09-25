package com.dsi.si.provadsi.provadsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.si.provadsi.provadsi.models.Care;
import com.dsi.si.provadsi.provadsi.services.CareService;

@RestController("care")
public class CareController {

	@Autowired
	private CareService service;
	
	@GetMapping("todos")
	public ResponseEntity<List<Care>> findAll(){
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Care> findOne(@PathVariable("id") Long id){
		return ResponseEntity.ok(service.getOneCare(id));
	}
	
	@PostMapping
	public ResponseEntity<Care> findOne(Care care){
		return ResponseEntity.ok(service.save(care));
	}
}
