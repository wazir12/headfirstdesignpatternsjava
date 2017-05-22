package com.example.designpatterns.strategy.fly;

import com.example.designpatterns.strategy.FlyBehaviour;

public class FlyWithRocketPowered implements FlyBehaviour {
    public String fly() {
        return "Look at me bitch, I'm flying";
    }
}
