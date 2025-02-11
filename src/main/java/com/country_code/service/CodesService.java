package com.country_code.service;

import com.country_code.repo.CodesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodesService {

    @Autowired
    private CodesRepo codesRepo;


    public List<Integer> getAllCodes(){
        return codesRepo.getAllCountryCodes();
    }
}
