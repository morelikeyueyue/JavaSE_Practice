package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //查表法
        //1.从键盘输入字符串
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if (money>=0&&money<=9999999){
                    break;
            }else {
                System.out.println("金额无效");
            }
        }
        //2.将数字转化为大写
        //定义一个变量用来表示钱的大写
        String moneyStr = "";
//        System.out.println(money);
        //得到money里面的每一位数字
        int number = money;
        while (true) {
            //从右往左获取数字
            int ge = number%10;
            //去掉刚刚获取的数字
            number = number/10;
//            System.out.println(ge);
            String capitalNumber = getCapital(ge);
            moneyStr=capitalNumber+moneyStr;
            //如果数字上的每一位都全部获取到了,那么number记录的数字就是0,此时循环结束
            if (number==0){
                break;
            }
        }
        //3.在前面补零,补齐三位
        moneyStr = fillString(moneyStr);
//        System.out.println(moneyStr);

        //4.插入单位,定义一个数组来表示单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        //遍历moneyStr 依次得到
        //然后把arr的单位插入进去
        String result ="";
        result = getString(moneyStr, arr, result);

        //5.打印结果
        System.out.println();
        System.out.println(result);

    }

    private static String fillString(String moneyStr) {
        int count =7- moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr ="零"+ moneyStr;
        }
        return moneyStr;
    }

    private static String getString(String moneyStr, String[] arr, String result) {
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result +c+ arr[i];
            System.out.print(c);
            //打印一下单位
            System.out.print(arr[i]);
        }
        return result;
    }

    //定义一个方法把数字变成大写的中文
    public static String getCapital(int number){
        //定义数组,让数字跟大写的中文产生关系
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //返回结果
        return arr[number];
    }
}
