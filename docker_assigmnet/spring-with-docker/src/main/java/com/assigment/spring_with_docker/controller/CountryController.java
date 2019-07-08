package com.assigment.spring_with_docker.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assigment.spring_with_docker.bean.CountryBean;
import com.assigment.spring_with_docker.service.CountryServiceInterface;

@Controller
@RequestMapping(value = "/countries")
public class CountryController {

	
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
    @Autowired
	CountryServiceInterface countryService;   
	@RequestMapping(value = "/getCountry/{countryCode}", method = RequestMethod.GET)
	@ResponseBody
	public CountryBean getCountryBycode (@PathVariable String countryCode) throws Exception
	{	
		LOG.info("Getting  country by county code : ");
		CountryBean country= countryService.getCountryByCode(countryCode);
		return country;
	}


}
