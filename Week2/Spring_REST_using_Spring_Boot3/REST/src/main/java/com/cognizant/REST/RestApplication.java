package com.cognizant.REST;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class RestApplication {


	private static final Logger LOGGER =
			LoggerFactory.getLogger(RestApplication.class);


	public static void main(String[] args) {


		SpringApplication.run(
				RestApplication.class,
				args
		);


		displayCountry();


	}



	public static void displayCountry(){


		LOGGER.info("START");


		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");


		Country country =
				context.getBean(
						"country",
						Country.class
				);


		LOGGER.debug(
				"Country : {}",
				country
		);


		LOGGER.info("END");


	}


}