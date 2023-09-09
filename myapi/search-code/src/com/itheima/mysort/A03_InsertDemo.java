package com.itheima.mysort;

import java.util.Random;

public class A03_InsertDemo {
    public static void main(String[] args) {
        /*
            插入排序：
                将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
                遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
                N的范围：0~最大索引

        */
//        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        //找到有序的索引终点,+1就是无序的开始索引

        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        InsertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("插入排序花费了"+(end-start)+"毫秒");
//        printArr(arr);
    }

    private static void InsertSort(int[] arr) {
        int startIndex = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<= arr[i+1]){
                continue;
            }else if (arr[i]> arr[i+1]){
                startIndex = i+1;
                break;
            }
        }
//        System.out.println(startIndex);
        //2.遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //问题：如何把遍历到的数据，插入到前面有序的这一组当中

            //记录当前要插入数据的索引
            int j =i;
            while (j>0&& arr[j]< arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    private static void printArr(int[] arr) {
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
