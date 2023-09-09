package com.qiqi.test;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int tmp = 1;
        int[] c = new int[n+1];
        c[0] = 1;
        //得到c[i]
        for (int i = 1; i < c.length; i++) {
            tmp *= a[i];
            c[i] = tmp;
        }
        //得到ci-1 * bi
        tmp = 0;
        int[] b = new int[n+1];
        for (int i = 1; i < b.length; i++) {
            b[i] = m%c[i];
            b[i] = b[i] - tmp;
            tmp +=b[i];
        }
        for (int i = 1; i < b.length; i++) {
            b[i] = b[i]/c[i-1];
            System.out.print(b[i]+" ");
        }

    }
}
