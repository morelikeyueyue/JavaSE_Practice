package com.itheima.test.polymophismtest1;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.print(this.getAge()+"���"+this.getColor()+"��ɫ�Ĺ���ֻ�������ı�ס"+something+"�ͳ�");
    }

    public void lookHome() {
        System.out.println("�����ڿ���");
    }
}
