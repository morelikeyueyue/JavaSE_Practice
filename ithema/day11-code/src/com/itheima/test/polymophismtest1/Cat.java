package com.itheima.test.polymophismtest1;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.print(this.getAge()+"���"+this.getColor()+"��ɫ��è�����۾�����ͷ��"+something);
    }

    public void catchMouse(){
        System.out.println("è����ץ����");
    }
}
