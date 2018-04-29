package com.kleinpix.services;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Customer;
import com.kleinpix.repositories.CustomerRepositoryImpl;
import com.kleinpix.repositories.CustomerRepository;
import com.kleinpix.services.CustomerService;

public class CustomerServiceImpl implements CustomerService{

            private static CustomerServiceImpl service = null;

            CustomerRepository repository = CustomerRepositoryImpl.getInstance();

            public static CustomerServiceImpl getInstance(){
                if(service == null)
                    service = new CustomerServiceImpl();

                return service;
    }

    public Customer create(Customer customer){
                return repository.create(customer);
    }

    public Customer read(int id){
                return repository.read(id);
    }

    public Customer update(Customer customer){
                return repository.update(customer);
    }

    public void delete(int id){
                repository.delete(id);
    }
}
