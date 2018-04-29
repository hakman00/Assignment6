package com.kleinpix.factories;

import com.kleinpix.model.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    Map<String,String> values;
    int id;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<>();
        id = 1;
        values.put("name","Heinrich");
        values.put("surname", "Klein");
    }

    @Test
    public void getName() {
        Customer customer1 = CustomerFactory.getCustomer(values,id);
        assertEquals(1,customer1.getId());
    }
}