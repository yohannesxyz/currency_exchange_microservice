package com.currencyExchange.microservices.currency_exchange_service.controller;

import com.currencyExchange.microservices.currency_exchange_service.beans.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
@GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
){
return new CurrencyExchange(1L,from,to, BigDecimal.valueOf(50));
}
}
