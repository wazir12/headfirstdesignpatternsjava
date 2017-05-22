package com.example.designpatterns.abstractfactory.pizzas;

import com.example.designpatterns.abstractfactory.ingredientfactories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }
}
