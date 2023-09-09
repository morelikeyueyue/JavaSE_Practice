package com.itheima.test.oop_abstracttest1;

public class Frog extends Animal{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("ÇàÍÜ³Ô³æ×Ó");
    }
}
