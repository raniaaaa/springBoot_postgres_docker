package com.assigment.spring_with_docker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assigment.spring_with_docker.bean.CountryBean;
import com.assigment.spring_with_docker.dao.Country;
import com.assigment.spring_with_docker.dto.CountryDtoReprositry;
import com.assigment.spring_with_docker.exception.GeneralException;

@Service
public class CountryServiceImpl implements CountryServiceInterface {

	
	@Autowired
	CountryDtoReprositry countryDto;
	
	public CountryBean getCountryByCode(String code) throws GeneralException {
		
		Country  country=countryDto.findOne(code);
		if(country==null) {
			throw new GeneralException("INVALID_COUNTRY_CODE");
		}
		return null;
	}

	
	
	private CountryBean convertCountryDaoToCountryBean (Country country) {
		
		CountryBean countryBean =new CountryBean();
		countryBean.setName(country.getName());
		countryBean.setLifeExpectancy(country.getLife_expectancy());
		countryBean.setContinent(country.getContinent());	
		if(country.getLanguage()!=null)
			countryBean.setLanguage(country.getLanguage().getLanguage());
		
		return countryBean;
	}
}
