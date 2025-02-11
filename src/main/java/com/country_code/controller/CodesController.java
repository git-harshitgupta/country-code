package com.country_code.controller;

import com.country_code.service.CodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CodesController {

    @Autowired
    private CodesService codesService;


    @GetMapping("/codes")
    public List<Integer> getAllCodes(){
        return codesService.getAllCodes();
    }


}
