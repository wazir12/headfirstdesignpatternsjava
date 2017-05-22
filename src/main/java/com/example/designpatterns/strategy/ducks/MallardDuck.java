package com.example.designpatterns.strategy.ducks;

import com.example.designpatterns.strategy.Duck;
import com.example.designpatterns.strategy.fly.FlyWithWings;
import com.example.designpatterns.strategy.quack.Quack;

class MallardDuck extends Duck {

    MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }


    public String display() {
        return "I'm a Mallard duck";
    }
}
