package com.itheima.test.polymophismtest1;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("����",30);
        Person p2 = new Person("����",25);

        Dog a1=new Dog(2,"��");
        Cat a2=new Cat(3,"��");

        p1.keepPet(a1, "��ͷ");
        p2.keepPet(a2, "��");
    }
}
