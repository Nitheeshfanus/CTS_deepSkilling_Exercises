package com.cognizant.REST.controller;


import com.cognizant.REST.Country;
import com.cognizant.REST.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CountryController {


    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);


    @Autowired
    private CountryService countryService;


    @RequestMapping("/country")
    public Country getCountryIndia(){


        LOGGER.info("START");


        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "country.xml"
                );

                
        Country country =
                context.getBean(
                        "country",
                        Country.class
                );


        LOGGER.info("END");


        return country;

    }

    @GetMapping("/countries/{code}")
    public Country getCountry(
            @PathVariable String code
    ){


        LOGGER.info("START");


        Country country =
                countryService.getCountry(code);


        LOGGER.info("END");


        return country;


    }


}