package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //1.����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String s1 = sc.nextLine();

        //2.���б���
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.print(c);
        }
    }
}
