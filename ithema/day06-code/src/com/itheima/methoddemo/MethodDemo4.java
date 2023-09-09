package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //带返回值的方法的定义和调用
        //格式  public static 返回值类型 方法名(参数){ 方法体;return 返回值;}

        double sum1 = getSum(10,20,30);
        double sum2 = getSum(20,60,20);
        double sum3 = getSum(10,20,40);
        double sum = getSum(sum1,sum2,sum3);
        System.out.println(sum);
    }
    public static double getSum(double num1,double num2,double num3) {
        double result = num1+num2+num3;
        return result;
    }
}
