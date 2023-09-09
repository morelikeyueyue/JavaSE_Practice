package com.itheima.test;

import java.util.Scanner;


public class Test11 {
    public static void main(String[] args) {
        //需求:给你一个整数,如果是一个回文数,如果是回文数打印true,不是则打印false

        //分析:
        //1.从键盘录入整数
        //2.利用for循环嵌套if

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        String str = String.valueOf(num);
//        int length = num.length();
        for (int i = 0, k = str.length() - 1; i <= k; i++, k--) {
            do {
                if (str.charAt(i) != str.charAt(k)) {
                    System.out.println("false");
                    break;
                }

            } while (i == k);
            System.out.println("true");
        }
//        for(int i = 0,k=str.length()-1; i <= k; i++,k--) {
//            if(str.charAt(i)!=str.charAt(k)) {
//                return false;
//            }
//        }
//        return true;
    }
}
