package com.example.designpatterns.strategy.fly;

import com.example.designpatterns.strategy.FlyBehaviour;

public class FlayNoWay implements FlyBehaviour {
    public String fly() {
        return "I can't fly :(";
    }
}
