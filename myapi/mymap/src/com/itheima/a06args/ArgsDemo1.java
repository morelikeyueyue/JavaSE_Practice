package com.itheima.a06args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        /*
         计算n个数据的和
         */
        System.out.println(getSun(10,20));
        System.out.println(getSun(10,20,30));
        System.out.println(getSun(10,20,30,40));

    }

    private static int getSun(int a, int b) {
        return a+b;
    }

    private static int getSun(int a, int b,int c) {
        return a+b+c;
    }

    private static int getSun(int a, int b,int c,int d) {
        return a+b+c+d;
    }
}
