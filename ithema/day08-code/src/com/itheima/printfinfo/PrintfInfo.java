package com.itheima.printfinfo;

public class PrintfInfo {
    public static void main(String[] args) {
        String s = "sadasd";
        char c = 'a';
        int num1 = 10;
        float num2 = 20;
        double  num3 = 30.145665466;
        System.out.printf("%c", c);
        System.out.println();
        System.out.printf("%s",s);
        System.out.println();
        System.out.printf("%d",num1);
        System.out.println();
        System.out.printf("%f",num3);
        System.out.println();
        System.out.printf("%E",num3);
        System.out.println();
        System.out.printf("%.2f",num3);
        System.out.println();
        System.out.printf("%s%n", "next line");// %n 表示换行
        System.out.printf("%s = %s%n", "Name", "Regino");// %n 还可以支持多个参数
        System.out.printf("%S = %s%n", "Name", "Regino");// %S 将字符串以大写形式输出
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "ino", "Reg");// 支持多个参数时，可以在%s之间插入变量编号，1$表示第一个字符串，3$表示第3个字符串
    }
}
