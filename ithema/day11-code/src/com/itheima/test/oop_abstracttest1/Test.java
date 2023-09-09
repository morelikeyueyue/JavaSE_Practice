package com.itheima.test.oop_abstracttest1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog f = new Frog("小青",1);
        Dog d = new Dog("小黄",2);
        Sheep s = new Sheep("小羊",3);

        System.out.println(f.getName() + ", " +f.getAge());
        f.eat();
        System.out.println(d.getName() + ", " +d.getAge());
        d.eat();
        System.out.println(s.getName() + ", " +s.getAge());
        s.eat();
    }
}
