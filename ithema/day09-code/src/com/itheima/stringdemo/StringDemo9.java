package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //手机号屏蔽
        //1.从键盘得到一个11位的手机号
        Scanner sc = new Scanner(System.in);
        String phoneNumber;
        while(true){
            System.out.println("请输入手机号:");
            phoneNumber = sc.next();
            if (phoneNumber.length()==11){
                break;
            }else {
                System.out.println("输入手机号不正确");
            }
        }

        //2.截取手机号码的前三位(从开始索引到结束索引的前一位)
        String start = phoneNumber.substring(0, 3);

        //3.截取手机号的后4位(从开始索引的后一位到末尾)
        String end = phoneNumber.substring(7);

        //4.拼接
        String result = start+"****"+end;

        //5.打印
        System.out.println(result);
    }
}
