package com.example.designpatterns.proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GumballMachineTestDrive {

    @Test
    public void testGenerate10Gumballs() throws Exception {
        int count = 10;

        GumballMachine gumballMachine = new GumballMachine("Test Machine", count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);


        System.out.println(gumballMachine);

        assertEquals("Test Machine", gumballMachine.getLocation().toString());
        assertEquals(10, gumballMachine.getCount());
        assertEquals("waiting for quarter", gumballMachine.getState().toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current state: " + gumballMachine.getState());

        assertEquals("Test Machine", gumballMachine.getLocation().toString());
        assertEquals(0, gumballMachine.getCount());
        assertEquals("sold out", gumballMachine.getState().toString());
    }


}
