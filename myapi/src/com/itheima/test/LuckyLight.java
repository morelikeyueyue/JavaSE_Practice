package com.itheima.test;

import java.util.Random;

public class LuckyLight {
    public static void main(String[] args) {

        //1.定义三种颜色
        String[] arr = {"red", "green", "yellow"};
        //2.定义总次数
        int num = 10000;
        //3.定义存储总共次数的数组
        double[] arr1 = new double[12];
        //4.定义随机抽取颜色方法
        for (int j =0;j<num;j++) {
            //定义三种颜色的数量
            int redCount = 0;
            int yellowCount = 0;
            int greenCount = 0;
            for (int i = 0; i < 9; i++) {
                if (getLight() == 1) {
                    redCount++;
                } else if (getLight() == 2) {
                    greenCount++;
                } else if (getLight() == 3) {
                    yellowCount++;
                }
            }
//            System.out.println("数量为:"+redCount+yellowCount+greenCount);
            //5.判断结果
            judgeResult(redCount, yellowCount, greenCount, arr1);
        }
        //6.得到概率
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            arr1[i]=arr1[i]/num;
        }
        //7.打印
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("第"+(i+1)+"种情况的概率为:"+arr1[i]+"%");
        }
    }

    private static void judgeResult(int redCount, int yellowCount, int greenCount, double[] arr1) {
        if (redCount == 9 || greenCount == 9 || yellowCount == 9) {
            arr1[0]++;
        } else if (redCount == 8 || greenCount == 8 || yellowCount == 8) {
            arr1[1]++;
        } else if (redCount == 7 || greenCount == 7 || yellowCount == 7) {
            if (redCount ==1|| greenCount ==1|| yellowCount ==1){
                arr1[2]++;
            }
            if (redCount == 2 || greenCount == 2 || yellowCount == 2) {
                arr1[3]++;
            }

        } else if (redCount == 6 || greenCount == 6 || yellowCount == 6) {
            if (redCount ==3|| greenCount ==3|| yellowCount ==3){
                arr1[4]++;
            }
            if (redCount ==2|| greenCount ==2|| yellowCount ==2){
                arr1[5]++;
            }

        } else if (redCount == 5 || greenCount == 5 || yellowCount == 5) {
            if (redCount ==4|| greenCount ==4|| yellowCount ==4){
                arr1[6]++;
            }
            if (redCount ==3|| greenCount ==3|| yellowCount ==3){
                arr1[7]++;
            }
            if (redCount ==2|| greenCount ==2|| yellowCount ==2){
                arr1[8]++;
            }

        } else if (redCount == 4 || greenCount == 4 || yellowCount == 4) {
            if (redCount ==3|| greenCount ==3|| yellowCount ==3){
                arr1[9]++;
            }
            if(redCount ==4|| greenCount ==4|| yellowCount ==4){
                arr1[10]++;
            }

        } else if (redCount == 3 || greenCount == 3 || yellowCount == 3) {
            arr1[11]++;
        }
    }

    public static int getLight() {
        Random r = new Random();
        return r.nextInt(3) + 1;
    }
}
