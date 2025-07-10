package com.mrinal.packages.animals;

import com.mrinal.packages.vehciles.Maruti;

public class Dog {
    String name;
    int feets;
    Maruti car=new Maruti(10);

    int speed=car.getSpeed();
    public void setCarSpeed(int n){
        car.setSpeed(n);
    }
    public static void main(String [] args){
        Dog dog=new Dog();
        dog.setCarSpeed(10);
        
    }

}
