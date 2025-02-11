package com.country_code.service;


import com.country_code.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepo countryRepo;

    public List<String> getAllCountries(){
        return countryRepo.getAllCountries();
    }
}
