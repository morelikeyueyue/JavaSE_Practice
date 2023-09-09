package com.itheima.oop_interclass.test1;

public class Test {
    public static void main(String[] args) {
//        Outer.Inner oi = new Outer().new Inner();

        Outer o = new Outer();
        System.out.println(o.name);

        System.out.println(o.getInstance());
        Object i = o.getInstance();

    }
}
