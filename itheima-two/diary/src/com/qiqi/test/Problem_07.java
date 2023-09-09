package com.qiqi.test;

import java.util.HashSet;
import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sentenceNum = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < sentenceNum; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y!=0&&!set.contains(y)){
                count++;
            }
            set.add(x);
        }
        System.out.println(count);
    }
}
