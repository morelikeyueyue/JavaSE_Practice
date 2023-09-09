package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        /*需求:键盘录入一个字符串,统计该字符串的大写字母\小写字母\数字出现的次数
         */

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();

        //定义变量记录大写字母总数\小写字母总数\数字总数(统计----计数器思想)
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        //2.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //得到单个字符
            char c = str.charAt(i);
            //进行比较
            if (c<='Z'&&c>='A') {
                bigCount++;
            } else if (c <= 'z' && c >= 'a') {
                smallCount++;
            }else if (c<='9'&&c>='0') {
                numberCount++;
            }else {
                otherCount++;
            }
        }
        //3.输出打印
        System.out.printf("大写字母有:%d个,\n小写字母有:%d个,\n数字有%d个,\n其他字符有%d个\n", bigCount, smallCount,numberCount,otherCount);
    }
}
