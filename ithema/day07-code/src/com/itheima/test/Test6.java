package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*需求:6名评委打分,去掉一个最高分和最低分求平均
         */
        //分析:
        //1.定义一个数组用来存储评委的打分(0~100)
        int[] scoreArr = new int[6];
//        for (int i = 0; i < scoreArr.length; i++) {
//            System.out.println(scoreArr[i]);
//        }
        scoreArr = randomArray(scoreArr);
        //2.去掉一个最高分和一个最低分再求平均
        double avg = sortArray(scoreArr);
//        for (int i = 0; i < scoreArr.length; i++) {
//            System.out.println(scoreArr[i]);
//        }
        System.out.println(avg);
    }

    //定义一个数组6次随机打分
    public static int[] randomArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i <arr.length; i++) {
            arr[i] = r.nextInt(101);
        }
//        System.out.println("请输入评委的分数:");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//            if(arr[i] <0 || arr[i] >100 ){
//                System.out.println("输入数据范围有误");
//                break;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        return arr;
    }

    //方法:去掉一个最高分和最低分(直接排序归零)
    public static double sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        arr[0] = 0;
        arr[arr.length - 1] = 0;
        //数组遍历
//        for (int i : arr) {
//            System.out.println(i);
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        double sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
//        System.out.println(sum);
        sum = sum/(arr.length-2);
        return sum;
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<max){
                max = arr[i];
            }
        }
        return max;
    }
}
