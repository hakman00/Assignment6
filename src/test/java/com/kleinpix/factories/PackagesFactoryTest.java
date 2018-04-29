package com.kleinpix.factories;

import com.kleinpix.model.Additional;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class PackagesFactoryTest {
    //Setup for Package...
    Package pack;
    Map<String, String> packageValues;
    int packageId;
    double packagePrice;

    //setup for Additional as Foreign Key...
    List<Additional> additionalList;
    Map<String, String> values;
    int additionalId;
    double additionalPrice;
    Additional additional;

    @Before
    public void setUp() throws Exception {
        //setup for the Package...
        packageValues = new HashMap<String, String>();
        packageValues.put("name","Standard Wedding");
        packagePrice = 8400.00;
        packageId = 1;
        //setting up additional for this package...
        additionalId = 2;
        additionalPrice = 320.00;
        values = new HashMap<>();
        values.put("name","Jumbo Pints");
        additional = AdditionalFactory.getCustomer(values,additionalId,additionalPrice);
        additionalList = new ArrayList<>();
        additionalList.add(additional);
    }

    @Test
    public void getCustomer() {
        assertEquals("Standard Wedding", pack.getName());
    }
}