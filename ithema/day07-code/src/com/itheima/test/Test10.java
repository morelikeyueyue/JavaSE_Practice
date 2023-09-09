package com.itheima.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        //使用代码模拟抽奖,打印出每个奖项,奖项出现要随机并且不重复
        //分析:
        //定义一个数组存储奖池

        //1.把奖池里面的所有奖项打乱顺序
        int[] arr= {2,588,888,1000,10000};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着i跟随机索引上的值进行交换
            int temp=arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //2.遍历奖池,从0索引开始获取每一个奖项
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
