package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "ABC";
//        String s3 = new String("abc");
//        System.out.println(s1==s3);
//        //��ȫһ��
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        //���Դ�Сд
//        System.out.println(s1.equalsIgnoreCase(s2));

        //1.�������ڼ���¼��һ��adc
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���:");
        String s1 = sc.next();  //new������
        //2.�������ٶ���һ��adc
        String s2 = "abc";
        String s3 = new String("abc");
        //3.��==�űȽ��Ƿ�һ��
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
