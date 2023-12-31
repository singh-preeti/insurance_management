package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Insurance;
import com.insurance.service.InsuranceService;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {
	@Autowired
	private InsuranceService insuranceService;
   
	@GetMapping("/get")
	public ResponseEntity<List<Insurance>> getAll()
	{
		return ResponseEntity.ok(insuranceService.findAll());
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Insurance> addAll(@RequestBody Insurance insurance)
	{
		return ResponseEntity.ok(insuranceService.save(insurance));
	}
	
	
	//@PutMapping("/update")
	
	//@DeleteMapping("/{id}")

}
