package com.company;

public class APPLIANCES {
    private String model;
    private double power;
    private int age;
    private String Country;

    public APPLIANCES(String model, double power, int age, String country) {
        this.model = model;
        this.power = power;
        this.age = age;
        Country = country;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return Country;
      }
    public String getInfo() {
        return "Model: " + model + "\nPower: " + power +
                "\nModel: " + model +
                "\nAge: " + age +
                "\nCountry: " + getCountry() +
                "\n_________________________________________";
    }
}
