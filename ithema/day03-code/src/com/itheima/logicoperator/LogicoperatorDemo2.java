package com.itheima.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //1. && ��·��
        //���߶������Ϊ��
        //true
        //false
        //false
        //false
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        //2. || ��·��
        //���߶�Ϊ�ٲ�Ϊ��
        //true
        //true
        //true
        //false
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        //3.���ж�·Ч��,&��\�������߶�Ҫִ��
        //����߲������������󲻻������ұ߲���
        int a =10;
        int b =20;
        boolean result =++a<5&&++b>5;
        System.out.println(result);//false
    }
}
