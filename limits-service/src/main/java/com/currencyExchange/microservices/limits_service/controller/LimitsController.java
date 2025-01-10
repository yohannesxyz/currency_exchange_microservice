package com.currencyExchange.microservices.limits_service.controller;

import com.currencyExchange.microservices.limits_service.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retriveLimits(){
        return new Limits(1,1000);

    }


}
