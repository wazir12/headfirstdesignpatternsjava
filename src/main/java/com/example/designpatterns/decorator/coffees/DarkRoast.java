package com.example.designpatterns.decorator.coffees;

import com.example.designpatterns.decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return .99;
    }
}
