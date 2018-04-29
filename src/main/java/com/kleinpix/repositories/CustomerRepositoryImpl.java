package com.kleinpix.repositories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;

    private Map<Integer,Customer> customerTable;

    private CustomerRepositoryImpl(){
        customerTable = new HashMap<Integer, Customer>();
    }

    public static CustomerRepositoryImpl getInstance(){
        if(repository == null)
            repository = new CustomerRepositoryImpl();

        return repository;
    }

    public Customer create(Customer customer){
        customerTable.put(customer.getId(),customer);
        Customer savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public Customer read(int id){
        Customer customer = customerTable.get(id);
        return customer;
    }

    public Customer update(Customer customer){
        customerTable.put(customer.getId(),customer);
        Customer savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public void delete(int id){
        customerTable.remove(id);
    }
}
