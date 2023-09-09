package com.itheima.Arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2.获取数组里面的元素
        //格式:  数组名[索引]
        //数组长度  数组名.length
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]);
        }
        //扩展:
        //自动的快速生成数组的遍历方式 idea
        // 数组名.fori
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
