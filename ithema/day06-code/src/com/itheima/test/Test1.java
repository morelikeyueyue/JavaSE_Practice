package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //����:����һ������,�󳤷��ε��ܳ�,���ҽ���ڷ����д�ӡ
        //1.�Ӽ������볤�Ϳ�
        Scanner sc = new Scanner(System.in);
        System.out.println("�����볤:");
        double len = sc.nextDouble();
        System.out.println("�������:");
        double row = sc.nextDouble();
        getLength(len, row);
        //2.�������ܳ�����

        System.out.println("������Բ�İ뾶:");
        double r = sc.nextDouble();
        getCirclArea(r);
    }

    public static void getLength(double len, double row) {
        double length = (len + row) * 2;
        System.out.println("�����ε��ܳ�Ϊ:" + length);
    }
    public static void getCirclArea(double row){
        double area = row*row*3.14;
        System.out.println("Բ�����Ϊ:"+area);
    }
}
