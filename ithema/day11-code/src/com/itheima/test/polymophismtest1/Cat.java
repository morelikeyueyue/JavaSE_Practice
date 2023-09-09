package com.itheima.test.polymophismtest1;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.print(this.getAge()+"岁的"+this.getColor()+"颜色的猫眯着眼睛侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫正在抓老鼠");
    }
}
