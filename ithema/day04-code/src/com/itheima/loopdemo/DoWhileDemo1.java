package com.itheima.loopdemo;


public class DoWhileDemo1 {
    /*
    初始化语句;
    do{
    循环语句体;
    条件控制语句;
    }while(条件判断句);
     */
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);
    }
}