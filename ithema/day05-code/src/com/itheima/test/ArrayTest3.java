package com.itheima.test;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*需求:定义一个数组存储1~10,遍历每一个元素
        要求:如果是奇数扩大两倍,如果是偶数则变成二分之一
         */

        //1.定义一个数组存储1~10
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //2.用for循环和if判断
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr1[i] /= 2;
            } else {
                arr1[i] *= 2;
            }
        }
        //一个循环只做一件事情
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
