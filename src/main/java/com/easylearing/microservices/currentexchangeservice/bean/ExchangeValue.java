package com.easylearing.microservices.currentexchangeservice.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class ExchangeValue {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "curr_from")
    private String from;

    @Column(name = "curr_to")
    private String to;

    private BigDecimal conversionMultiple;

    @Column(nullable = true)
    private Integer port;

}
