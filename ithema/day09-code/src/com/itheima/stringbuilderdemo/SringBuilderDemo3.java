package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class SringBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程
        //当我们调用一个方法的时候不需要用变量接收他的结果,可以继续调用别的方法
        int length = getString().substring(1).replace("A", "Q").length();
        System.out.println(length);


    }


    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        return str;
    }
}
