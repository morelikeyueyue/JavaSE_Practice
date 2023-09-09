package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //小红,如果你这次考试全班第一,我就做你女朋友

        /*分析:
        1.从键盘输入明的名词
        2.比较分析小明的名次
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入小明的名次:");
        int ranking = sc.nextInt();
        if(ranking==1){
            System.out.println("小红成为了小明的女朋友.");
        }
    }
}
