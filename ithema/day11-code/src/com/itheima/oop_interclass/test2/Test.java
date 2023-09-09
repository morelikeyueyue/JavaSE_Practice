package com.itheima.oop_interclass.test2;

public class Test {
    public static void main(String[] args) {

        //编写匿名内部类的代码
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

    }
}
