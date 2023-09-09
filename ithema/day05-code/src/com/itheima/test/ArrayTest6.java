package com.itheima.test;

public class ArrayTest6 {
    public static void main(String[] args) {
        /*需求:定义一个数组,存入1~5,交换首尾索引对应的元素
        交换前:1,2,3,4,5
        交换后:5,4,3,2,1
         */

        //1.定义一个数组存储1~5
        int[] arr1 = {1,2,3,4,5};
        //2.定义一个变量充当中间值记录
        int temp;
        int len =arr1.length;
        //3.利用for循环交换位置
//        for (int i = 0; i < len/2+1; i++) {
//            temp = arr1[i];
//            arr1[i] = arr1[len-1-i];
//            arr1[len-1-i] = temp;
//        }

        for(int i = 0,j = len-1;i<j;i++,j-- ){
            temp =arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
