package com.assigment.spring_with_docker.service;

import com.assigment.spring_with_docker.bean.CountryBean;

public interface CountryServiceInterface {

	
	CountryBean getCountryByCode(String code) throws Exception;
}
