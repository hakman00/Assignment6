package com.kleinpix.services;

import com.kleinpix.factories.CustomerFactory;
import com.kleinpix.model.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerServiceTest {
    CustomerService service;
    Map<String,String> values;

    @Before
    public void setUp() throws Exception {
        service = new CustomerServiceImpl();
        values = new HashMap<String, String>();
        int id = 1;
        values.put("name","Luke");
        values.put("surname","Klein");
    }

    @Test
    public void create() throws Exception {
        Customer customer = CustomerFactory.getCustomer(values,3);
        service.create(customer);
        assertEquals(3,customer.getId());
    }

    @Test
    public void read() throws Exception{
        Customer readCustomer = service.read(3);
        assertEquals(3,readCustomer.getId());
    }

    @Test
    public void update()throws Exception {
        Customer customer = service.read(3);
        Customer newCustomer = new Customer.Builder()
                .id(3)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .build();
        service.update((newCustomer));
        Customer UpdateCustomer = service.read(3);
        assertEquals(3,UpdateCustomer.getId());
    }

    @Test
    public void delete() throws Exception{
        service.delete(3);
        Customer customer = service.read(3);
        assertNull(customer);
    }
}