package com.example.StoreJsonIntoTable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StoreJsonIntoTable.pojo.Analyst;
import com.example.StoreJsonIntoTable.service.AnalystService;

@RestController
public class AnalystController {

	//inject the DAO dependency -so the service can call DAO methods 
	//without manually creating the DAO object.
	@Autowired
	public AnalystService analystService;
	
	@PostMapping("/saveInTable")
	//ResponseEntity<String> is a wrapper,
	//spring boot sends a custom Http response
	public ResponseEntity<String> save(@RequestBody Analyst analyst) {
		analystService.saveAnalyst(analyst);
		return ResponseEntity.ok("Student saved successfully");
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Analyst>> fetch(){
		
		List<Analyst> analysts=analystService.getAllAnalyst();
		
		
		return ResponseEntity.ok(analysts);
	}

}
