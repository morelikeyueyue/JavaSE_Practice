package com.itheima.test.oop_abstracttest1;

public class Test {
    public static void main(String[] args) {
        //��������
        Frog f = new Frog("С��",1);
        Dog d = new Dog("С��",2);
        Sheep s = new Sheep("С��",3);

        System.out.println(f.getName() + ", " +f.getAge());
        f.eat();
        System.out.println(d.getName() + ", " +d.getAge());
        d.eat();
        System.out.println(s.getName() + ", " +s.getAge());
        s.eat();
    }
}
