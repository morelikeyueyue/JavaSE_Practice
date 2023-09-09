package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.nextLine();

        //2.进行遍历
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.print(c);
        }
    }
}
