package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class SringBuilderDemo3 {
    public static void main(String[] args) {
        //��ʽ���
        //�����ǵ���һ��������ʱ����Ҫ�ñ����������Ľ��,���Լ������ñ�ķ���
        int length = getString().substring(1).replace("A", "Q").length();
        System.out.println(length);


    }


    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���:");
        String str = sc.next();
        return str;
    }
}
