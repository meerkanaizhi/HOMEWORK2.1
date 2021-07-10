package com.company;

public class Plate extends APPLIANCES {
    public Plate (String model, double power, int age, String country){
        super (model, power, age, country);
    }
    public void Cook (String string){
        System.out.println(string);
    }
    public final void Cook(String s, String s2){
        System.out.println(s + s2);
    }
    public void Cook(String s,String s2,String condition) {
        System.out.println(s + s2 + condition);

    }
}
