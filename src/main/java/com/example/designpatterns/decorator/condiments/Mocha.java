package com.example.designpatterns.decorator.condiments;


import com.example.designpatterns.decorator.Beverage;
import com.example.designpatterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage coffee) {
        beverage = coffee;
    }

    public double cost() {
        return beverage.cost() + .20;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
