package com.itheima.oop_interclass.test1;

public class Outer {

    String name;
    private class Inner {

        static int a = 10;
    }

    public Inner getInstance(){
        return new Inner();
    }
}
