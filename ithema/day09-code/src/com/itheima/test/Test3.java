package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    //����¼���ַ���,�������������
    public static void main(String[] args) {
        //1.����¼���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ַ���:");
        String str = sc.next();

        //2.�������������,���÷���
        String result = breakDownString(str);
        System.out.println(result);

    }

    //�����ַ������������
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
