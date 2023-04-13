package com.springmicroservice.Address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservice.Address.response.AddressResponse;
import com.springmicroservice.Address.service.AddressService;

@RestController
public class addressController {
	
	@Autowired
	private AddressService addressService;
	
@GetMapping("/address/{employeeid}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeid") int id) {
		AddressResponse response=null;
		response=addressService.findAddressByAddress(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
