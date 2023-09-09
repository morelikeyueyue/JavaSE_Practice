package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "ABC";
//        String s3 = new String("abc");
//        System.out.println(s1==s3);
//        //完全一样
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        //忽略大小写
//        System.out.println(s1.equalsIgnoreCase(s2));

        //1.假设我在键盘录入一个adc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s1 = sc.next();  //new出来的
        //2.代码中再定义一个adc
        String s2 = "abc";
        String s3 = new String("abc");
        //3.用==号比较是否一致
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
