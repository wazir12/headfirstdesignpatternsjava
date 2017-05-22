package com.example.designpatterns.strategy.ducks;

import com.example.designpatterns.strategy.Duck;
import com.example.designpatterns.strategy.fly.FlayNoWay;
import com.example.designpatterns.strategy.quack.MuteQuack;

class ModelDuck extends Duck {

    ModelDuck() {
        flyBehaviour = new FlayNoWay();
        quackBehaviour = new MuteQuack();
    }

    public String display() {
        return "I'm a Model Duck";
    }
}
