package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    //键盘录入字符串,打乱里面的内容
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();

        //2.打乱里面的内容,调用方法
        String result = breakDownString(str);
        System.out.println(result);

    }

    //打乱字符串里面的内容
    public static String breakDownString(String str) {
        char[] arr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length-1);
            char temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }
        String result = new String(arr);
        return result;
    }
}
