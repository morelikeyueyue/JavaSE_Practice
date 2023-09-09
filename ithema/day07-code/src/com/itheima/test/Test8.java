package com.itheima.test;

public class Test8 {
    //数字解密
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {8, 3, 4, 6};
        arr = changeArray(arr);
        arr = sortArray(arr);
        int num = company(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(num);
    }

    //翻转
    public static int[] changeArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    //解密判断0~4之间加10,5~9之间数字不变
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] += 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        return arr;
    }

    //将数组中的每一位拼接成整数
    public static int company(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        return number;
    }
}