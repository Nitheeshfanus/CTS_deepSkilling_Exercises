package orm_learn.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import orm_learn.model.Country;
import orm_learn.model.State;
import orm_learn.repository.CountryRepository;

import java.util.Optional;

import orm_learn.exception.CountryNotFoundException;

@Service
public class CountryService {


    @Autowired
    private CountryRepository countryRepository;


    @Transactional
    public List<Country> getAllCountries(){

        return countryRepository.findAll();

    }

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

    Optional<Country> result =
            countryRepository.findById(countryCode);


    if(result.isEmpty()){

        throw new CountryNotFoundException(
            "Country not found"
        );

    }

    return result.get();
    }


    @Transactional
    public void addCountry(Country country) {

    countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(String code, String name)
        throws CountryNotFoundException {


    Country country = findCountryByCode(code);


    country.setName(name);


    countryRepository.save(country);

    }

    @Transactional
    public void deleteCountry(String code) {

    countryRepository.deleteById(code);

    }

    // @Transactional
    // public List<State> getStates(String code)
    //     throws CountryNotFoundException {

    // Country country =
    //     findCountryByCode(code);

    // return country.getStates();
    // }


}