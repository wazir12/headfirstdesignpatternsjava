package com.example.designpatterns.command;

class NoCommand implements Command {
    public void execute() {
        System.out.println("executed NoCommand");
    }

    public void undo() {
        System.out.println("undo NoCommand");
    }
}
