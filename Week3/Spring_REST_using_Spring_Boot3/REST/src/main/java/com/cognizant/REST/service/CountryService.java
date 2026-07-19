package com.cognizant.REST.service;


import java.util.ArrayList;

import org.springframework.stereotype.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cognizant.REST.Country;


@Service
public class CountryService {



    public Country getCountry(String code){



        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "country.xml"
                );



        ArrayList<Country> countries =
                context.getBean(
                        "countryList",
                        ArrayList.class
                );



        for(Country country : countries){


            if(
                country.getCode()
                .equalsIgnoreCase(code)
            ){

                return country;

            }


        }



        return null;


    }


}