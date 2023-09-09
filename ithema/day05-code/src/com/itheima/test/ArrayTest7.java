package com.itheima.test;

import java.util.Random;

public class ArrayTest7 {
    public static void main(String[] args) {
        /*需求:定义一个数组存入1~5,要求打乱数组中所有数据的顺序
         */

        //1.定义一个数组存入1~5
        int[] arr1 ={1,2,3,4,5};

        //定义for循环
        int temp;
        Random r = new Random();

        for (int i = 0; i < arr1.length; i++) {
            int randomIndex = r.nextInt(arr1.length);
            temp = arr1[randomIndex];
            arr1[randomIndex] = arr1[i];
            arr1[i] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
