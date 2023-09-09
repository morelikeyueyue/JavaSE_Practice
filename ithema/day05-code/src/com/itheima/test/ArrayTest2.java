package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*需求:定义一个数组存储1~10,
        统计其中有多少个元素能被三整除 */

        //1.定义一个数组存储1~10
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //2.定义for循环
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            //3.用if判断是否能整除3
            if (arr1[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
