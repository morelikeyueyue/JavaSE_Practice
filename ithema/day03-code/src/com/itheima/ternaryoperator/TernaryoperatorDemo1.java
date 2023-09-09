package com.itheima.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //需求:使用三元运算符,获取两个数的较大值

        int num1 = 10;
        int num2 = 20;
        //分析:
        /*1.从键盘输入两个数
          2.使用三元运算符获取两个整数的较大值
          3.整个三元表达式的结果必须要被使用
         */
        int max = num1>num2?num1:num2;
        System.out.println(max);
        System.out.println(num1>num2?num1:num2);
    }
}
