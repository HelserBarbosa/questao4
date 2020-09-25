package com.dsi.si.provadsi.provadsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.si.provadsi.provadsi.services.StaffService;

@RestController("staff")
public class StaffController {

	@Autowired
	private StaffService service;
}
