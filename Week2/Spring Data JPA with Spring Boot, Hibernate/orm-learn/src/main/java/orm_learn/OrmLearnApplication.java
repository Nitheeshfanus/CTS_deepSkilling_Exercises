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


    public static void main(String[] args) {


        ApplicationContext context =
                SpringApplication.run(
                        OrmLearnApplication.class,
                        args);


        countryService =
                context.getBean(
                        CountryService.class);


        testGetAllCountries();

    }


    private static void testGetAllCountries(){

        System.out.println("START");

        List<Country> countries =
                countryService.getAllCountries();


        System.out.println(countries);


        System.out.println("END");
    }

}