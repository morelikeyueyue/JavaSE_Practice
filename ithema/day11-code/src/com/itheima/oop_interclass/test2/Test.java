package com.itheima.oop_interclass.test2;

public class Test {
    public static void main(String[] args) {

        //��д�����ڲ���Ĵ���
        new Swim() {

            @Override
            public void swim() {
                System.out.println("��д����Ӿ�ķ���");
            }
        };

    }
}
