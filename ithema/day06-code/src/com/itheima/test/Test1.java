package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //需求:定义一个方法,求长方形的周长,并且结果在方法中打印
        //1.从键盘输入长和宽
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长:");
        double len = sc.nextDouble();
        System.out.println("请输入宽:");
        double row = sc.nextDouble();
        getLength(len, row);
        //2.调用求周长方法

        System.out.println("请输入圆的半径:");
        double r = sc.nextDouble();
        getCirclArea(r);
    }

    public static void getLength(double len, double row) {
        double length = (len + row) * 2;
        System.out.println("长方形的周长为:" + length);
    }
    public static void getCirclArea(double row){
        double area = row*row*3.14;
        System.out.println("圆的面积为:"+area);
    }
}
