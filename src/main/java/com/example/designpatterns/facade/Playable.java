package com.example.designpatterns.facade;

interface Playable {
    void on();

    void off();

    boolean isOn();

    void play(String resource);
}
