package com.itheima.oop_interface.test1;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("���ӳԺ��ܲ�");
    }
}
