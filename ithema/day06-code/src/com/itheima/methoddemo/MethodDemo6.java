package com.itheima.methoddemo;

public class MethodDemo6 {
    public static void main(String[] args) {
        //�������ú���ջ ջ�ڴ�  new������洢�����ڶ��ڴ�

        int number = 100;
        System.out.println("����change����ǰ:"+number);
        change(number);
        System.out.println("����change������:"+number);
        int[] arr ={1,20,30};
        change(arr);
        System.out.println(arr[1]);
        //���ݻ���


    }
    public static void change(int number){
        number = 200;
    };
    public static void change(int[] arr){
        arr[1] = 200;
    }
}
