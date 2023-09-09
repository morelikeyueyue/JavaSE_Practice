package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //使用代码模拟抽奖,打印出每个奖项,奖项出现要随机并且不重复
        //分析:
        //定义一个数组存储奖池
        int[] arr1 = {2, 588, 1000, 10000};
        //定义一个新数组用于存储抽奖的结果
        int[] newArr = new int[arr1.length];
        //抽奖
        Random r = new Random();
//        for(int i:newArr) {
//            System.out.print(i+" ");
//        }
//        boolean flag =contains(newArr,1);
//        System.out.println(flag);
        for (int i = 0; i < 4; ) {
        int randomIndex = r.nextInt(arr1.length);
        int prize = arr1[randomIndex];
//        System.out.println(arr1[randomIndex]);
//        System.out.println(prize);
        boolean flag = contains(newArr, prize);
//        System.out.println(flag);
        if (!flag) {
            newArr[i] = prize;
            i++;
        }
        }

//        for (int i = 0; i < 5; ) {
//            //获取随机索引
//            int randomIndex = r.nextInt(arr1.length);
//            int prize = arr1[randomIndex];
//            System.out.println(arr1[randomIndex]);
//            System.out.println(prize);
//            //判断当前奖项是否存在,如果存在则重新抽取,不存在,表示为有效奖项
//            boolean flag = contains(newArr, prize);
//            System.out.println(flag);
//            if (!flag) {
//                //把当前抽取到的奖项添加到newArr中
//                newArr[i] = prize;
//                //添加完毕之后,移动索引
//                i++;
//            }
//        }
        for (int j : newArr) {
            System.out.print(j + " ");
        }
    }

    //判断prize在数组当中是否存在
    //存在返回true
    //不存在返回false
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
//                System.out.println(arr[i]);
//                System.out.println(prize);
                return true;
            }
        }
        return false;
    }
}
