package com.testapi.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestData {
    private String SUCCESS = "SUCCESS";

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public String getTestData(){
        return SUCCESS;
    }
}
