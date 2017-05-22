package com.example.designpatterns.state;

interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
