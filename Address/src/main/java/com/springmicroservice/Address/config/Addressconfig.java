package com.springmicroservice.Address.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Addressconfig {

	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
}
