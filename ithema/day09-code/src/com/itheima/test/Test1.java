package com.itheima.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        /*罗马数字和数字转换

         */

        //1.从键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入要转换的数字:");
            str = sc.next();

            //2.长度小于等于9并且里面是数字(定义方法)
            boolean flag = checkString(str);
//            System.out.println(flag);
            if (flag) {
                //
                break;
            } else {
                //不合法
                System.out.println("当前输入的字符串不合规则,请重新输入");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String result = changeLuoMa(c);
//            int number = c - '0';
//            String result = changeLuoMa(number);
            sb.append(result).append(" ");
        }

        System.out.println(sb);

        //查表法
//        定义一个方法

    }

    //判断录入的字符串是否合法
    public static boolean checkString(String str) {
        //长度小于9
        if (str.length() > 9) {
            return false;
        }
        //全部是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
    }

    //查找对应的罗马数字(整数)
    public static String changeLuoMa(int number) {
        //定义一个数组,让索引跟罗马数字产生一个对应关系
        String[] arr = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return arr[number];
    }

    //查找对应的罗马数字(字符)
    public static String changeLuoMa(char c) {
        String str =switch (c) {
            case '0' ->" ";
            case '1' ->"I";
            case '2' ->"II";
            case '3' ->"III";
            case '4' ->"IV";
            case '5' ->"V";
            case '6' ->"VI";
            case '7' ->"VII";
            case '8' ->"VIII";
            case '9' ->"IX";
            default -> str="";
        };

        return str;
    }


}
