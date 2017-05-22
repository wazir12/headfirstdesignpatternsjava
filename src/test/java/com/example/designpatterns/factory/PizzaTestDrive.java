package com.example.designpatterns.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTestDrive {

    @Test
    public void testCreatePizza() throws Exception {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        String expectedCheese = "---- Cheese Pizza ----\n" +
                "Regular Crust\n" +
                "Marinara Pizza Sauce\n" +
                "Fresh Mozzarella\n" +
                "Parmesan\n";

        System.out.println(pizza.toString());
        assertEquals(expectedCheese, pizza.toString());

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        String expectedVeggie = "---- Veggie Pizza ----\n" +
                "Crust\n" +
                "Marinara sauce\n" +
                "Shredded mozzarella\n" +
                "Grated parmesan\n" +
                "Diced onion\n" +
                "Sliced mushrooms\n" +
                "Sliced red pepper\n" +
                "Sliced black olives\n";
        assertEquals(expectedVeggie, pizza.toString());
        System.out.println(pizza.toString());


    }
}
