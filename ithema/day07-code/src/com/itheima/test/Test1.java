package com.itheima.test;

import jdk.nashorn.internal.ir.Flags;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*�ɻ�Ʊ�۸��յ���������ͷ�Ȳպ;��ò��շѣ������Ʊԭ�ۡ��·ݺ�ͷ�Ȳջ��߾��ò�
        �������¹�������Ʊ�۸�������5~10�£�ͷ�Ȳ�9�ۣ����ò�9.5�ۣ�������11�µ�����4�£�ͷ�Ȳ�7�ۣ����ò�6.5��
         */

        //����:
        //1.����Ʊ�� �·� �;��òջ�ͷ�Ȳ�
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ʊ��:");
        double salePrice = sc.nextDouble();
        System.out.println("�������·�:");
        int month =sc.nextInt();
        System.out.println("������ͷ�Ȳջ��߾��ò�:");
        String seat = sc.next();
//        String str1 = "���ò�";
//        String str2 = "ͷ�Ȳ�";
//        boolean flag1=str.equals(str1);
//        boolean flag2 = str.equals(str2);
//        if(flag1){
//            System.out.println("aaa");
//        }else if(flag2){
//            System.out.println("bbb");
//        }else{
//            System.out.println("��λ�������");
//        }
        //2.���÷������ҽ��ܷ�������
        double finallyTPrice = price(salePrice, month, seat );
        System.out.println("���ļ۸�Ϊ:"+finallyTPrice+"Ԫ");

    }

    //����:
    // ��Ҫ:double Ʊ�� int �·� string ���òջ���ͷ�Ȳ� ��Ҫ���ؼ��������Ʊ��
    public static double price(double salePrice, int month,String array){
        String str1 = "���ò�";
        String str2 = "ͷ�Ȳ�";
        boolean flag1=array.equals(str1);
        boolean flag2 = array.equals(str2);
        double price;
        if(month >=5&&month<=10){
            if(flag2){
                price = salePrice*0.9;
                return price;
            }else if(flag1){
                price = salePrice*0.95;
                return price;
            }else{
                System.out.println("��λ�������");
                return 0;
            }

        }else if(month <=5&&month>=1||month<=12&&month>=11){
            if(flag2){
                price = salePrice*0.7;
                return price;
            }else if(flag1){
                price = salePrice*0.65;
                return price;
            }else{
                System.out.println("��λ�������");
                return 0;
            }
        }else{
            System.out.println("�·��������");
            return 0;
        }
    }
}
