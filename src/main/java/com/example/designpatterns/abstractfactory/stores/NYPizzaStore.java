package com.example.designpatterns.abstractfactory.stores;

import com.example.designpatterns.abstractfactory.PizzaStore;
import com.example.designpatterns.abstractfactory.ingredientfactories.NYPizzaIngredientFactory;
import com.example.designpatterns.abstractfactory.ingredientfactories.PizzaIngredientFactory;
import com.example.designpatterns.abstractfactory.pizzas.CheesePizza;
import com.example.designpatterns.abstractfactory.pizzas.Pizza;
import com.example.designpatterns.abstractfactory.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style Veggie pizza");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese pizza");
        }

        return pizza;
    }
}
