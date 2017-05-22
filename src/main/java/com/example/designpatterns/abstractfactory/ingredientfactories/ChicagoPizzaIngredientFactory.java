package com.example.designpatterns.abstractfactory.ingredientfactories;


import com.example.designpatterns.abstractfactory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggie[] createVeggies() {
        return new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPeperoni() {
        return new PepperoniCubes();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
