package com.itheima.methoddemo;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        //目标:在方法里面定义两个变量并且求和打印
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();
        getSum(num1,num2);
    }
//    public static void getSum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数字:");
//        int num1 = sc.nextInt();
//        System.out.println("请输入第二个数字:");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("和为"+sum);
//    }
    public static void getSum(int a, int b){
        int num1 = a;
        int num2 = b;
        int sum = num1 + num2;
        System.out.println("和为"+sum);


        //形参:全称形式参数,是指方法定义中的参数
        //实参:全称实际参数,方法调用中的参数
    }
}
