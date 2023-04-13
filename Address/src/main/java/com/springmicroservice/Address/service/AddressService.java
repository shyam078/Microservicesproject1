package com.springmicroservice.Address.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmicroservice.Address.Entity.Address;
import com.springmicroservice.Address.Repositiry.AddressRepo;
import com.springmicroservice.Address.response.AddressResponse;

@Service
public class AddressService {

	@Autowired
	AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	public AddressResponse findAddressByAddress(int employeeid) {
		
		Address address= addressRepo.findAddressByEmployee(employeeid);
		AddressResponse addressResponse =mapper.map(address, AddressResponse.class);
		return addressResponse;
	}
}
