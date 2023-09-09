package com.itheima.test.polymophismtest1;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.print(this.getAge()+"岁的"+this.getColor()+"颜色的狗两只腿死死的抱住"+something+"猛吃");
    }

    public void lookHome() {
        System.out.println("狗正在看家");
    }
}
