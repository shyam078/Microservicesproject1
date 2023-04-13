package com.springmicroservice.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmicroservice.Employee.entity.Employee;

public interface jparepo extends JpaRepository<Employee, Integer>{

}
