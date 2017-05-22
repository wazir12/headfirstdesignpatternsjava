package com.example.designpatterns.strategy.fly;

import com.example.designpatterns.strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    public String fly() {
        return "Check out my cool wings while I'm flying";
    }
}
