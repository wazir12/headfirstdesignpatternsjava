package com.example.designpatterns.strategy.quack;

import com.example.designpatterns.strategy.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public String quack() {
        return "<< Silence >>";
    }
}
