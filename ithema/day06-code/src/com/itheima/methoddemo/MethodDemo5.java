package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        /*����������:
        ��ͬһ������,������ͬ���ķ���,��Щͬ���ķ�������ͬ�ֵĹ���
        ÿһ������Ҫ�в�ͬ�Ĳ������ͻ��߲�������
         */

        //Ŀ��:����ȫ��������,�Ƚ��������Ƿ���ͬ
        compare((byte) 10,(byte) 20);
    }
    public static void compare(int num1,int num2){
        if(num1!=num2){
            System.out.println("������������ͬ");
        }else{
            System.out.println("����������ͬ");
        }
    }
    public static void compare(byte num1,byte num2){
        if(num1!=num2){
            System.out.println("������������ͬ");
        }else{
            System.out.println("����������ͬ");
        }
    }
    public static void compare(short num1,short num2){
        if(num1!=num2){
            System.out.println("������������ͬ");
        }else{
            System.out.println("����������ͬ");
        }
    }
    public static void compare(long num1,long num2){
        if(num1!=num2){
            System.out.println("������������ͬ");
        }else{
            System.out.println("����������ͬ");
        }
    }
}
