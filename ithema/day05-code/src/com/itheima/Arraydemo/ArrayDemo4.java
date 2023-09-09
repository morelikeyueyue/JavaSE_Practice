package com.itheima.Arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //数组动态初始化
        //格式:  数据类型[] 数组名 = new 数据类型[数组长度];

        String[] arr1 = new String[50];

        arr1[0] = "zhangsan";
        arr1[1] = "lisi";

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);  //默认初始化值为 null

        //数组默认初始值
        //整数 0
        //小数 0.0
        //字符类型 '/u000'
        //布尔类型  false
        //引用数据类型  null

        int[] arr2 = new int[3];
        System.out.println(arr2[0]);
    }
}
