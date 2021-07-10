package com.company;

public class Oven extends Plate{
    @Override
    public String toString() {
        return super.toString();
    }
    public Oven (String model, double power, int age, String country) {
        super(model, power, age, country);
    }
}

