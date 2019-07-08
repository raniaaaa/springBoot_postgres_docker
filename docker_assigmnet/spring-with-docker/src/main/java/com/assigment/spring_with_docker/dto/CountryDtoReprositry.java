package com.assigment.spring_with_docker.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assigment.spring_with_docker.dao.City;
import com.assigment.spring_with_docker.dao.Country;

public interface CountryDtoReprositry  extends JpaRepository<Country, String>{

	
	
	Country getCountryByCode(String code);
}
