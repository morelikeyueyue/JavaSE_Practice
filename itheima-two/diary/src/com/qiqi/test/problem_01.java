package com.qiqi.test;

import java.util.Arrays;
import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        /*

         */

        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个正整数表示年数");
        int year = sc.nextInt();
//        System.out.println("请输入一个实数i表示年利率");
        double rate = sc.nextDouble();
//        System.out.println("请输入n+1个整数比哦啊是预计收入或者支出");
        int[] arr = new int[year+1];
        for (int i = 0; i < year+1; i++) {
            arr[i] = sc.nextInt();
        }
        double reallySum = 0.0;
        for (int i = 1; i < arr.length; i++) {
            reallySum+=(arr[i])/Math.pow((1+rate),i);
        }
        System.out.print(reallySum-(-arr[0]));


    }
}
