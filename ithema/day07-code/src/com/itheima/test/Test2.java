package com.itheima.test;

import java.util.Scanner;

/**
 * @author 25718
 */
public class Test2 {
//             ctrl+alt+M  自动抽取方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票价:");
        double salePrice = sc.nextDouble();
        System.out.println("请输入月份:");
        int month =sc.nextInt();
        System.out.println("请输入头等舱或者经济舱:");
        String seat = sc.next();
        double sale = salePrice * judgeMonth(month,seat);
        System.out.println(sale);
    }

    //判断月份
    public static double judgeMonth(int month, String seat) {
        String str1 = "经济舱";
        String str2 = "头等舱";
        boolean flag1=seat.equals(str1);
        boolean flag2 = seat.equals(str2);
        return extracted(month, flag1, flag2);
    }

    private static double extracted(int month, boolean flag1, boolean flag2) {
        if(month >=5&& month <=10){
            if(flag1){
                return 0.9;
            }else if (flag2){
                return 0.95;
            }else{
                System.out.println("舱位输入错误");
                return 0;
            }

        }else if (month <=5&& month >=1|| month <=12&& month >=11){
            if(flag1){
                return 0.7;
            }else if (flag2){
                return 0.65;
            }else{
                System.out.println("舱位输入错误");
                return 0;
            }
        }else {
            System.out.println("月份输入错误");
            return 0;
        }
    }
}
