package com.currencyExchange.microservices.limits_service.controller;

import com.currencyExchange.microservices.limits_service.bean.Limits;
import com.currencyExchange.microservices.limits_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits(){
        return new Limits(configuration.getMinimum(),
                configuration.getMaximum());

    }


}
