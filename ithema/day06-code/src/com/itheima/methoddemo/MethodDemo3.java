package com.itheima.methoddemo;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        //Ŀ��:�ڷ������涨����������������ʹ�ӡ
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������:");
        int num1 = sc.nextInt();
        System.out.println("������ڶ�������:");
        int num2 = sc.nextInt();
        getSum(num1,num2);
    }
//    public static void getSum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("�������һ������:");
//        int num1 = sc.nextInt();
//        System.out.println("������ڶ�������:");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("��Ϊ"+sum);
//    }
    public static void getSum(int a, int b){
        int num1 = a;
        int num2 = b;
        int sum = num1 + num2;
        System.out.println("��Ϊ"+sum);


        //�β�:ȫ����ʽ����,��ָ���������еĲ���
        //ʵ��:ȫ��ʵ�ʲ���,���������еĲ���
    }
}
