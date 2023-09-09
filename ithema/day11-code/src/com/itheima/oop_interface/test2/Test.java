package com.itheima.oop_interface.test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

/*        System.out.println(Inter.a);
        Inter.a = 20;*/

        //创建实现类对象,并调用方法
        InterImpl ii = new InterImpl();
        ii.method();


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
    }
}
