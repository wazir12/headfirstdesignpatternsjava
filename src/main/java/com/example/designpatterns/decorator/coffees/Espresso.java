package com.example.designpatterns.decorator.coffees;


import com.example.designpatterns.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
