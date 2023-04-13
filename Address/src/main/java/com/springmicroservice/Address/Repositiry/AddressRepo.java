package com.springmicroservice.Address.Repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springmicroservice.Address.Entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

	@Query(nativeQuery = true,value = "SELECT ad.id,ad.lane1,ad.lane2,ad.state,ad.zip FROM micro_services.address ad join micro_services.employee e on e.id=ad.employee_id where ad.employee_id=1;")
	Address findAddressByEmployee(@Param("employeeid") int employeeid);
}
