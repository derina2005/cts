package com.cognizant.orm_learn.service;

import java.util.List;

import com.cognizant.orm_learn.model.Country;

public interface CountryService {

    List<Country> getAllCountries();

    Country getCountry(String code);

    Country addCountry(Country country);

    Country updateCountry(Country country);

    void deleteCountry(String code);
}
