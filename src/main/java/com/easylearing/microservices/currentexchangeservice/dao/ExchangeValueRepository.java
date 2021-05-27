package com.easylearing.microservices.currentexchangeservice.dao;

import com.easylearing.microservices.currentexchangeservice.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    public ExchangeValue findByFromAndTo(String from,String to);
}
