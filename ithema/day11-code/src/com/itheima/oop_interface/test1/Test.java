package com.itheima.oop_interface.test1;

public class Test {
    public static void main(String[] args) {
        //��������
        Animal f = new Frog("����",1);

        Dog d = new Dog("С��",2);

        Rabbit r = new Rabbit("С����",3);

        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        if (f instanceof Frog fg){
            fg.swim();
        }
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();

        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();
    }
}
