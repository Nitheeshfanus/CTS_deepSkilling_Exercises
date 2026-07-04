package orm_learn;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import orm_learn.model.Country;
import orm_learn.service.CountryService;


@SpringBootApplication
public class OrmLearnApplication {


    private static CountryService countryService;


    public static void main(String[] args) throws Exception {


        ApplicationContext context =
                SpringApplication.run(
                        OrmLearnApplication.class,
                        args);


        countryService =
                context.getBean(
                        CountryService.class);


        testGetAllCountries();
		testFindCountryByCode();
		testAddCountry();

		Country country = countryService.findCountryByCode("IN");
		
		System.out.println(
			country.getStates());

    }


    private static void testGetAllCountries(){

        System.out.println("START");

        List<Country> countries =
                countryService.getAllCountries();


        System.out.println(countries);


        System.out.println("END");
    }


	private static void testFindCountryByCode() throws Exception {

    System.out.println("START");


    Country country =
        countryService.findCountryByCode("IN");


    System.out.println(country);


    System.out.println("END");
    }

	private static void testAddCountry() 
        throws Exception {

    System.out.println("Start");


    Country country = new Country();

    country.setCode("JP");
    country.setName("Japan");


    countryService.addCountry(country);


    Country result =
        countryService.findCountryByCode("JP");


    System.out.println(result);


    System.out.println("End");
    }
	

}