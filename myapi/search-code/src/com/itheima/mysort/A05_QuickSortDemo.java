package com.itheima.mysort;

import java.util.Random;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
       /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
      */
//        int[] arr = {6,1, 2, 7, 9, 3, 4, 5,10, 8};
        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println("快速排序花费了"+(end-start)+"毫秒");
/*        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/

    }

    /**
     * 参数一:我们要排序的数组
     * 参数二:要排序数组的起始索引
     * 参数三:要排序数组的结束索引
     * @param arr
     */
    public static void quickSort(int[] arr,int startIndex,int endIndex){
        //定义两个变量记录要查找的范围
        int start = startIndex;
        int end = endIndex;

        //递归的出口
        if (start>end){
            return;
        }




        //定义一个基准数
        int baseNumber = arr[startIndex];

        //利用循环找到要交换的数字
        while (start != end){
            //利用end从后往前开始找,找比基准数小的数字
            while (true){
                if (end <= start||arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //利用start从前往后找,找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //当start和end指向同一个元素时,结束while循环
        //找到了基准数在数组中应该存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字和start或者end对应的数字进行交换
        int temp = arr[startIndex];
        arr[startIndex] = arr[start];
        arr[start] = temp;

        //确定6左边的范围,重复刚刚的事情
        quickSort(arr, startIndex, start-1);
        //确定6右边的范围,重复刚刚的事情
        quickSort(arr, start+1, endIndex);

    }

}
