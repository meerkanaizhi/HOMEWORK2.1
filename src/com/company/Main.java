package com.company;

public class Main {

    public static void main(String[] args) {
       Country country = new Country();
       country.nameCountry= "Китай";
       Country country1= new Country();
       country1.nameCountry=  "Япония";
	   Plate plate = new Plate ("Plate Vitek", 500 , 2 , country.nameCountry);
	   plate.Cook("Плита для готовки еды");
	   System.out.println(plate.getInfo());
	   Oven oven= new Oven("Oven SAMSUNG", 1000, 4,country1.nameCountry);
	   oven.Cook("Печь для выпекания");
        System.out.println(oven.getInfo());
    }
}
