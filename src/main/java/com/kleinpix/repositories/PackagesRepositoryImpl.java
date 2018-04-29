package com.kleinpix.repositories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Packages;

import java.util.HashMap;
import java.util.Map;

public class PackagesRepositoryImpl {

    private static PackagesRepositoryImpl repository = null;

    private Map<Integer,Packages> customerTable;

    private PackagesRepositoryImpl(){
        customerTable = new HashMap<Integer, Packages>();
    }

    public static PackagesRepositoryImpl getInstance(){
        if(repository == null)
            repository = new PackagesRepositoryImpl();

        return repository;
    }

    public Packages create(Packages customer){
        customerTable.put(customer.getId(),customer);
        Packages savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public Packages read(int id){
        Packages customer = customerTable.get(id);
        return customer;
    }

    public Packages update(Packages customer){
        customerTable.put(customer.getId(),customer);
        Packages savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public void delete(int id){

        customerTable.remove(id);
    }
}
