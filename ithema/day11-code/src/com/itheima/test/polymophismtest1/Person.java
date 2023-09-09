package com.itheima.test.polymophismtest1;


public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    //养狗
    public void keepPet(Dog dog,String something){
        System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的狗\n"
                , this.age,this.name,dog.getColor(),dog.getAge());
        dog.eat(something);
        System.out.println();
    }

    //养猫
    public void keepPet(Cat cat,String something){
        System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的猫\n"
                , this.age,this.name,cat.getColor(),cat.getAge());
        cat.eat(something);
        System.out.println();
    }*/

    public void keepPet(Animal a,String something){
        if (a instanceof Dog){
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的狗");
            a.eat(something);
            System.out.println();
            ((Dog) a).lookHome();
        }else if (a instanceof Cat){
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的猫");
            a.eat(something);
            System.out.println();
            ((Cat) a).catchMouse();
        }

    }
}
