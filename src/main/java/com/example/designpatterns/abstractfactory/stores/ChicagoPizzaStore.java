package com.example.designpatterns.abstractfactory.stores;

import com.example.designpatterns.abstractfactory.PizzaStore;
import com.example.designpatterns.abstractfactory.ingredientfactories.ChicagoPizzaIngredientFactory;
import com.example.designpatterns.abstractfactory.ingredientfactories.PizzaIngredientFactory;
import com.example.designpatterns.abstractfactory.pizzas.CheesePizza;
import com.example.designpatterns.abstractfactory.pizzas.Pizza;
import com.example.designpatterns.abstractfactory.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie pizza");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese pizza");
        }

        return pizza;
    }
}
