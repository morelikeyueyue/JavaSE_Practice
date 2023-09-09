package com.itheima.ifdemo;

public class IfDemo2 {
    public static void main(String[] args) {
        /*
        1.大括号的开头可以另起一行,建议写在第一行的末尾
        2.如果只有一句代码,可以不惜大括号
        3.如果对员工布尔类型的变量进行判断,不要使用==号,直接把变量写在小括号中
         */

        int number = 20;
        if (number > 10) {
            System.out.println(number);
        }

//        boolean flag = false;
        boolean flag = true;
        if (flag) {
            System.out.println("flag的值为true");
        }
    }
}