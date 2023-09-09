package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class SringBuilderDemo4 {
    /*
    对称字符串:键盘接收一个字符串,判断是否对称
   使用stringbuilder的使用场景
   1.字符串拼接
   2.字符串的反转
     */
    public static void main(String[] args) {
        //1.从键盘接收一个字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //2.创建stringbuiilder对象
        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb);
        boolean result = sb.reverse().toString().equals(str);
        if (result){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串不是对称字符串");
        }
        System.out.println(result);

    }

}
