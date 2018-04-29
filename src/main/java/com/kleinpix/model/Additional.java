package com.kleinpix.model;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import java.io.Serializable;
import java.util.Objects;

public class Additional implements Serializable {

    private int id;
    private String name;
    private double price;

    private Additional() {

    }

    public Additional (Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
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

    public static class Builder {

        private int id;
        private String name;
        private double price;

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

        public Additional build(){
            return new Additional(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Additional that = (Additional) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
