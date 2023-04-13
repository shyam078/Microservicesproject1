package com.springmicroservice.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservice.Employee.empservice.empservice;
import com.springmicroservice.Employee.response.EmployeeRespo;

@RestController
public class empcontroller {
	@Autowired
	empservice empservice;
	
	@GetMapping("/employee/{id}")
	ResponseEntity<EmployeeRespo> getEmployeeDetails(@PathVariable("id") int id){
		
		EmployeeRespo respo=empservice.getbyid(id);
		return ResponseEntity.status(HttpStatus.OK).body(respo);
	}
}
