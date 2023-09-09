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

/*    //����
    public void keepPet(Dog dog,String something){
        System.out.printf("����Ϊ%d���%s����һֻ%s��ɫ��%d��Ĺ�\n"
                , this.age,this.name,dog.getColor(),dog.getAge());
        dog.eat(something);
        System.out.println();
    }

    //��è
    public void keepPet(Cat cat,String something){
        System.out.printf("����Ϊ%d���%s����һֻ%s��ɫ��%d���è\n"
                , this.age,this.name,cat.getColor(),cat.getAge());
        cat.eat(something);
        System.out.println();
    }*/

    public void keepPet(Animal a,String something){
        if (a instanceof Dog){
            System.out.println("����Ϊ"+this.age+"���"+this.name+"����һֻ"+a.getColor()+"��ɫ��"+a.getAge()+"��Ĺ�");
            a.eat(something);
            System.out.println();
            ((Dog) a).lookHome();
        }else if (a instanceof Cat){
            System.out.println("����Ϊ"+this.age+"���"+this.name+"����һֻ"+a.getColor()+"��ɫ��"+a.getAge()+"���è");
            a.eat(something);
            System.out.println();
            ((Cat) a).catchMouse();
        }

    }
}
