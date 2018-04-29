package com.kleinpix.repositories;

import com.kleinpix.factories.CustomerFactory;
import com.kleinpix.model.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerRepositoryTest {

    Map<String, String> values;
    int id;
    CustomerRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = CustomerRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("name","Alec");
        values.put("surname","Klein");
    }

    @Test
    public void create() throws Exception {
        Customer customer = CustomerFactory.getCustomer(values,2);
        repository.create(customer);
        assertEquals(2,customer.getId());
    }

    @Test
    public void read() throws Exception {
        Customer readcustomer = repository.read(2);
        assertEquals(2,readcustomer.getId());
    }

    @Test
    public void update() throws Exception {
        Customer customer = repository.read(2);
        Customer newCustomer = new Customer.Builder()
                //.id(22)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .build();
                repository.update(newCustomer);
                Customer UpdateCustomer = repository.read(2);
                assertEquals(2,UpdateCustomer.getId());
    }

    @Test
    public void delete() throws Exception {
        repository.delete(2);
        Customer customer = repository.read(2);
        assertNull(customer);
    }
}