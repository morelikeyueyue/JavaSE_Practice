package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    /*
    商品价格为1000,实行vip会员制
    一级会员9折,二级会员8折.三级会员7折,非会员不打折
     */

    public static void main(String[] args) {
        //分析
        //1.定义一个变量
//        float price = 1000;
        int price = 1000;

        //2.从键盘录入会员的等级
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入vip的等级:");
        int vip = sc.nextInt();
        if (vip > 0 && vip < 4) {
            if (vip == 1) {
                System.out.println("实际支付的钱为:"+price * 0.9);
            } else if (vip == 2) {
                System.out.println("实际支付的钱为:"+price * 0.8);
            } else if (vip == 3) {
                System.out.println("实际支付的钱为:"+price * 0.7);
            }
        } else {
            System.out.println("输入的vip等级不合理");
        }
    }
}
