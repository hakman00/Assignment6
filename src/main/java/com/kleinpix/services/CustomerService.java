package com.kleinpix.services;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Customer;

public interface CustomerService {

    Customer create(Customer customer);

    Customer read(int id);

    Customer update(Customer customer);

    void delete(int id);
}
