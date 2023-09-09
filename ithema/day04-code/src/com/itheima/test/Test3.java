package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    /*
    卖了一百张票,票的序号为1到100
    键盘录入一个整数表示电影票的票号
    奇数做左边,打印左边
    偶数做右边,打印右边
     */
    public static void main(String[] args) {
        /*分析:
        1.从键盘录入一个整数表示票号
        2.比较票号的奇偶,可以用余数比较法
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号:");
        int ticket = sc.nextInt();
        //只有当ticket输入在0到100之间时2才是真实有效的票
        if (ticket > 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("左边");
            } else {
                System.out.println("右边");
            }
        }
    }
}