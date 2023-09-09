package com.itheima.arraysdemo;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {



        //toString :将数组变成字符串
        System.out.println("-------------------------toString---------------");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));


        //binarySearch 二分查找发查找元素
        //细节1:二分查找的前提,数组中的元素必须是有序的,数组中的元素必须是升序的
        //细节2:查找的元素存在,返回真实索引,返回的是 - 插入点 -1 (插入点:如果存在应该存在的位置)
        System.out.println("-------------------------binarySearch---------------");
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 20));


        //copyOf 拷贝数组
        //参数一:老数组 参数二:新数组的长度
        //方法底层会根据第二个参数来创建新的数组,如果新数组的长度小于老数组的长度,会部分拷贝
        //等于 完全拷贝  大于 会补上默认初始值
        System.out.println("-------------------------copyOf---------------");
        int[] arr1 = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(arr1));

        //copyOfRange : 拷贝数组(指定范围)
        // 细节:包头不包尾 包左不包右
        System.out.println("-------------------------copyOfRange---------------");
        int[] newArr1 = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(newArr1));


        //fill : 填充数组
        System.out.println("-------------------------fill---------------");
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));

        //sort排序 默认情况下,基本数据类型进行升序排序 底层使用的是快速排序
        System.out.println("-------------------------sort---------------");
        int[] arr2 = {10,2,3,5,6,1,7,8,4,9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
