package com.kleinpix.factories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Additional;

import java.util.Map;

public class AdditionalFactory {
    public static Additional getCustomer(Map<String,String> values, int id, double price) {
        Additional customer = new Additional.Builder()
                .id(id)
                .name(values.get("name"))
                .price(price)
                .build();
        return customer;
    }
}
