package com.itheima.test.polymophismtest2;


public class Test2 {
    public static void main(String[] args) {
//        final int a = 0;
//        System.out.println(a);

    }
}


class Fu {
    public void show() {
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu {
    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
}