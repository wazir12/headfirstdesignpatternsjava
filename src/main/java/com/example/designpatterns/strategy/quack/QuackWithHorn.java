package com.example.designpatterns.strategy.quack;

import com.example.designpatterns.strategy.QuackBehaviour;

public class QuackWithHorn implements QuackBehaviour {
    public String quack() {
        return "Leeroy jenkins!";
    }
}
