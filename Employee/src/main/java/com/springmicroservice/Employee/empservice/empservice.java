package com.springmicroservice.Employee.empservice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springmicroservice.Employee.entity.Employee;
import com.springmicroservice.Employee.repository.jparepo;
import com.springmicroservice.Employee.response.AddressResponse;
import com.springmicroservice.Employee.response.EmployeeRespo;

@Service
public class empservice {
	
	@Autowired
	private ModelMapper mapper;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private jparepo  jparepo;
public EmployeeRespo getbyid(int id) {
	
		
	
	Employee employee=jparepo.findById(id).get();
	EmployeeRespo employeeRespo=mapper.map(employee, EmployeeRespo.class);
	 
	AddressResponse addressResponse=restTemplate.getForObject("http://localhost:8081/address-app/api/address/{id}", AddressResponse.class, id);
	
	employeeRespo.setAddressResponse(addressResponse);
	return employeeRespo;
}
}
