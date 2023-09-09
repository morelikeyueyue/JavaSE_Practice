package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    //自动驾驶 红绿灯
    public static void main(String[] args) {
        /*分析:
        1.用布尔类型来表示灯的亮和灭,也可以用数字1和2来表示,
        这样要从键盘输入的时候更加方便.
        2.绿灯行,黄灯等,红灯停
        3.对灯的状态进行判断
         */

        boolean LightGreen = true;
        boolean LightRed = false;
        boolean LightYELLOW = false;

        if(LightGreen){
            System.out.println("GO!");
        }
        if(LightRed){
            System.out.println("STOP!");
        }
        if(LightYELLOW){
            System.out.println("SLOW!");
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入绿灯的状态:");
//        int lightgreen = sc.nextInt();
//        System.out.println("输入红灯的状态:");
//        int lightred = sc.nextInt();
//        System.out.println("输入黄灯的状态:");
//        int lightyellow = sc.nextInt();
//        if(lightgreen = 1){
//            System.out.println("GO!");
//        }
//        if(lightred = 1){
//            System.out.println("STOP!");
//        }
//        if(lightyellow = 1){
//            System.out.println("SLOW!");
//        }
    }
}
