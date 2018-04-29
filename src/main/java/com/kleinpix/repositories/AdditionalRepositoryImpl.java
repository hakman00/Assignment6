package com.kleinpix.repositories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Additional;

import java.util.HashMap;
import java.util.Map;

public class AdditionalRepositoryImpl {

    private static AdditionalRepositoryImpl repository = null;

    private Map<Integer,Additional> customerTable;

    private AdditionalRepositoryImpl(){
        customerTable = new HashMap<Integer, Additional>();
    }

    public static AdditionalRepositoryImpl getInstance(){
        if(repository == null)
            repository = new AdditionalRepositoryImpl();

        return repository;
    }

    public Additional create(Additional customer){
        customerTable.put(customer.getId(),customer);
        Additional savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public Additional read(int id){
        Additional customer = customerTable.get(id);
        return customer;
    }

    public Additional update(Additional customer){
        customerTable.put(customer.getId(),customer);
        Additional savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public void delete(int id){

        customerTable.remove(id);
    }
}
