package com.easylearing.microservices.currentexchangeservice.controller;

import com.easylearing.microservices.currentexchangeservice.bean.ExchangeValue;
import com.easylearing.microservices.currentexchangeservice.dao.ExchangeValueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ExchangeServiceController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retreiveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to){
        logger.info("from is {} and to is {}", from, to);
        int port=Integer.parseInt(environment.getProperty("local.server.port"));

        ExchangeValue value=exchangeValueRepository.findByFromAndTo(from,to);
        value.setPort(port);
        return value;
    }


}
