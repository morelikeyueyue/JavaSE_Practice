package com.qiqi.test;

import java.util.Arrays;
import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入的第一行包含空格分隔的两个正整数n和分m别表示距离大赛开幕的天数和训练科目的数量。
        int day = sc.nextInt();
        int number = sc.nextInt();
        int[] lay = new int[number];
        for (int i = 0; i < number; i++) {
            lay[i] = sc.nextInt();
        }
        int[] needDay = new int[number];
        for (int i = 0; i < number; i++) {
            needDay[i] = sc.nextInt();
        }
        int[] startTime = new int[number];
        int[] lastTime = new int[number];
        for (int i = 0; i < number; i++) {
            startTime[i] = day+1;
            lastTime[i] = 1;
            int index = lay[i];
            int k = i;
            if (index == 0) {
                //无依赖项
                startTime[k] = startTime[k] - needDay[k];
                lastTime[k] = 1;
            }
            while (index != 0) {
                //有依赖项
                int x = needDay[i];
                if(k==i){
                    startTime[k] = startTime[k] - needDay[k];
                }
                startTime[lay[k] - 1] = startTime[lay[k] - 1] - x;
                lastTime[i] = lastTime[i]+needDay[lay[k]-1];
                k = lay[k] - 1;
                index = lay[k];
            }
        }
        boolean flag = true;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i]>10||startTime[i]<1){
                flag = false;
            }
        }

        for (int i = 0; i < lastTime.length; i++) {
            if (i<lastTime.length-1){
                System.out.print(lastTime[i]+" ");
            }else {
                System.out.println(lastTime[i]);
            }
        }
        if (flag){
            for (int i = 0; i < startTime.length; i++) {
                if (i<startTime.length-1){
                    System.out.print(startTime[i]+" ");
                }else {
                    System.out.print(startTime[i]);
                }
            }
        }

    }
}
