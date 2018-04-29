package com.kleinpix.model;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Packages implements Serializable{

    private int id;
    private String name;
    private double price;
    private List<Additional> additional;

    private Packages(){

    }

    public static class Builder{
        private int id;
        private String name;
        private double price;
        private List<Additional> additional;

        public Builder id(int values) {
            this.id = values;
            return this;
        }

        public Builder name(String values) {
            this.name = values;
            return this;
        }

        public Builder price(double values) {
            this.price = values;
            return this;
        }

        public Builder additional(List<Additional> values) {
            this.additional = values;
            return this;
        }

        public Packages build(){
            return new Packages(this);
        }
    }

    public Packages (Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
        this.additional = builder.additional;
    }

    public List<Additional> getAdditional() {
        return additional;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packages packages = (Packages) o;
        return id == packages.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
