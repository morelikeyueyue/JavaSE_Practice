package com.itheima.test;

import jdk.nashorn.internal.ir.Flags;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*飞机票价格按照淡季旺季、头等舱和经济舱收费，输入机票原价、月份和头等舱或者经济舱
        按照如下规则计算机票价格，旺季（5~10月）头等舱9折，经济舱9.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
         */

        //分析:
        //1.输入票价 月份 和经济舱或头等舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票价:");
        double salePrice = sc.nextDouble();
        System.out.println("请输入月份:");
        int month =sc.nextInt();
        System.out.println("请输入头等舱或者经济舱:");
        String seat = sc.next();
//        String str1 = "经济舱";
//        String str2 = "头等舱";
//        boolean flag1=str.equals(str1);
//        boolean flag2 = str.equals(str2);
//        if(flag1){
//            System.out.println("aaa");
//        }else if(flag2){
//            System.out.println("bbb");
//        }else{
//            System.out.println("舱位输入错误");
//        }
        //2.调用方法并且接受返回数据
        double finallyTPrice = price(salePrice, month, seat );
        System.out.println("最后的价格为:"+finallyTPrice+"元");

    }

    //方法:
    // 需要:double 票价 int 月份 string 经济舱或者头等舱 需要返回计算出来的票价
    public static double price(double salePrice, int month,String array){
        String str1 = "经济舱";
        String str2 = "头等舱";
        boolean flag1=array.equals(str1);
        boolean flag2 = array.equals(str2);
        double price;
        if(month >=5&&month<=10){
            if(flag2){
                price = salePrice*0.9;
                return price;
            }else if(flag1){
                price = salePrice*0.95;
                return price;
            }else{
                System.out.println("舱位输入错误");
                return 0;
            }

        }else if(month <=5&&month>=1||month<=12&&month>=11){
            if(flag2){
                price = salePrice*0.7;
                return price;
            }else if(flag1){
                price = salePrice*0.65;
                return price;
            }else{
                System.out.println("舱位输入错误");
                return 0;
            }
        }else{
            System.out.println("月份输入错误");
            return 0;
        }
    }
}
