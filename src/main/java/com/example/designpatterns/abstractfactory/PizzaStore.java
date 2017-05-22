package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.abstractfactory.pizzas.Pizza;

public abstract class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
