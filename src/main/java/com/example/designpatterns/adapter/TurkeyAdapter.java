package com.example.designpatterns.adapter;

import com.example.designpatterns.strategy.Duck;

class TurkeyAdapter extends Duck {
    private Turkey turkey;

    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public String display() {
        return "Look at me, I'm a " + turkey.getClass().getSimpleName();
    }

    @Override
    public String performFly() {
        return turkey.fly();
    }

    @Override
    public String performQuack() {
        return turkey.gobble();
    }
}
