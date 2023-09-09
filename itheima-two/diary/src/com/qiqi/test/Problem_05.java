package com.qiqi.test;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sentenceNum = sc.nextInt();
        int[][] data = new int[sentenceNum][2];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        if (data[0][1]==0){
            count++;
        }
        for (int i = 1; i < data.length; i++) {
            if (data[i][1]==0){
                //赋值给常量
                count++;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (data[i][1] == data[j][0]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(sentenceNum-count);
    }
}
