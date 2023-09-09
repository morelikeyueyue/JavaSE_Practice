package com.itheima.test;

import java.lang.reflect.Array;

public class Test6 {
    public static void main(String[] args) {
        //求数组的最大值
        //判断一个数组中是否存在某个数,并将结果放回给调用处
        //1.定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //2.调用方法求最大值
//        int max = getMax(arr);
//        System.out.println(max);
        boolean flag = isValid(arr, 5);
        System.out.println(flag);
    }

    //求数组的最大值(数组) 需要返回
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //判断一个数是否存在,将结果放回给调用处(数组,判断数字) 需要放回布尔类型
    public static boolean isValid(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }

    //return和break的区别
    //return跟方法有关 表示1结束方法 2返回结果
    //如果方法执行了return 那么整个方法全部结束,里面的循环也会结束
    //break跟循环有关,结束整个循环+
}
