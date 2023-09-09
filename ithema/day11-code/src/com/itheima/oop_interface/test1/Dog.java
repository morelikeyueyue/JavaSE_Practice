package com.itheima.oop_interface.test1;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("π∑≥‘π«Õ∑");
    }

    @Override
    public void swim() {
        System.out.println("π∑π∑ «π∑≈Ÿ");
    }
}
