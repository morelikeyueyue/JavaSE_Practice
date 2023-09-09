package com.itheima.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        //需求:定义一个数组存储1~5,求和

        //1.定义一个数组存储1~5
        int[] arr1 = {1, 2, 3, 4, 5};
        //2.利用for循环遍历求和
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);
    }
}
