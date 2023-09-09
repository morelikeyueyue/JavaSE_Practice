package com.itheima.mysort;

import java.util.Random;

public class A01_BubbleDemo1 {
    public static void main(String[] args) {
        /*
            冒泡排序：
            核心思想：
            1，相邻的元素两两比较，大的放右边，小的放左边。
            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
        */

        //1.定义数组
//        int[] arr = {2,4,5,3,1};
        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        BubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序花费了"+(end-start)+"毫秒");

/*        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/

    }

    private static void BubbleSort(int[] arr) {
        //外循环:表示执行轮数,如果n个数据,执行n-1轮
        for (int j = 0; j< arr.length-1; j++) {
            //2.利用冒泡排序将数组从小到大排序
            //内循环:每一轮中我如何比较数据
            // -1 为了防止索引越界 -i 提高效率
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i]> arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
