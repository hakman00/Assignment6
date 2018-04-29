package com.kleinpix.factories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Customer;

import java.util.Map;

public class CustomerFactory {

    public static Customer getCustomer(Map<String,String> values, int id) {
        Customer customer = new Customer.Builder()
                .id(id)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .build();
        return customer;
    }
}
