package com.example.designpatterns.abstractfactory.ingredientfactories;

import com.example.designpatterns.abstractfactory.ingredients.*;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createVeggies();

    Pepperoni createPeperoni();

    Clams createClam();
}
