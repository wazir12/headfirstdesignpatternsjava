package com.example.designpatterns.strategy.quack;

import com.example.designpatterns.strategy.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public String quack() {
        return "Quack!";
    }
}
