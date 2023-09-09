package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        /*方法的重载:
        在同一个类中,定义多个同名的方法,这些同名的方法具有同种的功能
        每一个方法要有不同的参数类型或者参数个数
         */

        //目标:兼容全整数类型,比较两个数是否相同
        compare((byte) 10,(byte) 20);
    }
    public static void compare(int num1,int num2){
        if(num1!=num2){
            System.out.println("这两个数不相同");
        }else{
            System.out.println("这两个数相同");
        }
    }
    public static void compare(byte num1,byte num2){
        if(num1!=num2){
            System.out.println("这两个数不相同");
        }else{
            System.out.println("这两个数相同");
        }
    }
    public static void compare(short num1,short num2){
        if(num1!=num2){
            System.out.println("这两个数不相同");
        }else{
            System.out.println("这两个数相同");
        }
    }
    public static void compare(long num1,long num2){
        if(num1!=num2){
            System.out.println("这两个数不相同");
        }else{
            System.out.println("这两个数相同");
        }
    }
}
