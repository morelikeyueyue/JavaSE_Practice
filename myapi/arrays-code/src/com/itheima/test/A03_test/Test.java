package com.itheima.test.A03_test;

public class Test {
    public static void main(String[] args) {
        int number = getNumber(10);
        System.out.println(number);
        int count = getCount(1);
        System.out.println(count);
    }
    public static int getNumber(int day){
        if (day==1){
            return 1;
        }
     return (getNumber(day-1)+1)*2;
    }

    public static int getCount(int day){
        if (day<0||day>11){
            System.out.println("当前时间错误");
            return -1;
        }
        if (day==10){
            return 1;
        }
        return (getCount(day+1)+1)*2;
    }
}
