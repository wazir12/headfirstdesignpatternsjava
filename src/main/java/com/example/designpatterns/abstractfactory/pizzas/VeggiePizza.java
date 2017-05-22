package com.example.designpatterns.abstractfactory.pizzas;

import com.example.designpatterns.abstractfactory.ingredientfactories.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        dough = ingredientFactory.createDough();
        veggies = ingredientFactory.createVeggies();
        cheese = ingredientFactory.createCheese();
    }
}
