package com.example.designpatterns.decorator.condiments;

import com.example.designpatterns.decorator.Beverage;
import com.example.designpatterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage coffee) {
        beverage = coffee;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
