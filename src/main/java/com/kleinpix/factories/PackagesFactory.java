package com.kleinpix.factories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Additional;
import com.kleinpix.model.Packages;

import java.util.List;
import java.util.Map;

public class PackagesFactory {
    public static Packages getCustomer(List<Additional> additional, Map<String, String> values, int id, double price) {
        Packages customer = new Packages.Builder()
                .id(id)
                .name(values.get("name"))
                .price(price)
                .additional(additional)
                .build();
        return customer;
    }
}
