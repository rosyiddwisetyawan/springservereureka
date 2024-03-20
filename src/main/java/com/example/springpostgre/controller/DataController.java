package com.example.springpostgre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping(value = "/data")
    public String getdata(){
        return "test";
    }
}
