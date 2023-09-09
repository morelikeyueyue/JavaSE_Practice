package com.itheima.a05_integerdemo;

import java.util.Scanner;

public class A01_IntegerDemo5 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
/*        String i  = sc.next();
        System.out.println(i);*/

        //弊端:当我们使用next nextint nextdouble 在接收数据的时候,遇到空格\回车\制表符的时候就停止了
        //键盘录入 123 123 那么此时只能接收到空格前面的数据
        //我想要的是接收一整行的数据
        //约定:
        //以后我们如果想要键盘录入,不管什么类型,统一使用nextLine
        //特点,遇到回车才停止

        String line = sc.nextLine();
        System.out.println(line);

        int i1 = Integer.parseInt(line);
        System.out.println(i1+1);
        double i2 = Double.parseDouble(line);
        System.out.println(i2+1);


    }
}
