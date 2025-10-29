package com.example.JDBCTemplateProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.JDBCTemplateProject.pojo.JDBCTemp;
import com.example.JDBCTemplateProject.service.JDBCTempService;


//JDBCTemplate -> spring provide "helper class" to reduce the boilerplate code and
//make the code simple and clean(like , open and close,exception handling,
//datasource, handle sql and resultset)
//{spring manage this db connection using datasource configured
//in application properties converts the result}, excutes sql query
// converts ResultSet into Java Objects (using RowMapper)

//JDBCTemplate -> makes us focus business logic and sql, and reduce boilerplate code

//RowMapper -> to map each row to a java object

//helper methods:
//update() -> insert,update,delete
//query() -> select returing multiple rows
//queryForObject() -> select for returing one row,one value(aggregate funcs)
//batchUpdate() -> For executing multiple sql statements together

@RestController
public class JDBCTempController {

	@Autowired
	public JDBCTempService service;
	
	//create
	@PostMapping("/saveEmp")
	public ResponseEntity<String> saveEmp(@RequestParam String name,@RequestParam int age){
		
		service.saveEmp(name,age);
		
		return ResponseEntity.ok("Saved Employee");
	}
	
	//read
	@GetMapping("/fetchAllEmp")
	public ResponseEntity<List<JDBCTemp>> fetchAllEmp(){
		
		List<JDBCTemp> list=service.fetchAllEmp();
		
		return ResponseEntity.ok(list);
	}
	
	//read one row
	@GetMapping("/fetchById")
	public ResponseEntity<JDBCTemp> fetchById(@RequestParam int id){
		
		JDBCTemp emp=service.fetchById(id);
		
		return ResponseEntity.ok(emp);
	}
	
	//update
	@PutMapping("/updateEmp")
	public ResponseEntity<String> updateEmp(@RequestParam int id,@RequestParam String name,@RequestParam int age){
		service.updateEmp(id,name,age);
		return ResponseEntity.ok("Updated Successfully");	
	}
	
	//delete
	@DeleteMapping("/deleteEmp")
	public ResponseEntity<String> deleteEmp(@RequestParam int id){
		service.deleteEmp(id);
		return ResponseEntity.ok("Deleted Successfully");	
	} 
	
	
	
}
