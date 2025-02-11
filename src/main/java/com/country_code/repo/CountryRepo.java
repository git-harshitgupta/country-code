package com.country_code.repo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CountryRepo {
//    (1,7,20,27,30,31,32,33,34,91);
    private final List<String> countries = Arrays.asList("USA","Russia","Egypt","South Africa","Greece","Netherlands","Belgium","France","Spain","India");

    public List<String> getAllCountries(){
        return countries;
    }
}
