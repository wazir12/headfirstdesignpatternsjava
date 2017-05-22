package com.example.designpatterns.abstractfactory.ingredientfactories;


import com.example.designpatterns.abstractfactory.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggie[] createVeggies() {
        return new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPeperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
