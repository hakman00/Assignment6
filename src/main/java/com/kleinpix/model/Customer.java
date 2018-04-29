package com.kleinpix.model;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable{

    private int id;
    private String name;
    private String surname;

    private Customer(){

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public static class Builder{
        private int id;
        private String name;
        private String surname;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder surname(String value){
            this.surname = value;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
