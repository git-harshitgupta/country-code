package com.country_code.repo;


import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CodesRepo {
    private final List<Integer> countryCodes = Arrays.asList(1,7,20,27,30,31,32,33,34,91);

    public List<Integer> getAllCountryCodes(){
        return countryCodes;
    }
}
