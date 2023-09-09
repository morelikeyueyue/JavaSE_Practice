package com.qiqi.test;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sentenceNum = sc.nextInt();
        int[] data = new int[num];
        int count = 0;
        for (int i = 0; i < sentenceNum; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y==0||data[y]==1){
                count++;
            }
            data[x] = 1;
        }
        System.out.println(sentenceNum-count);
    }
}
