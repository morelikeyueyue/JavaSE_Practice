package com.itheima.oop_interface.Test3;

public class BasPlayer extends Player {
    public BasPlayer() {
    }

    public BasPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学打篮球");
    }
}
