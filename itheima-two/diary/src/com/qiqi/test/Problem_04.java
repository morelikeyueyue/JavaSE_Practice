package com.qiqi.test;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] num = new double[n];
        double sumAvg = 0.0;
        double sumPow =0.0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
            sumAvg += num[i];
        }
        double avg = sumAvg/num.length;
        for (int i = 0; i < num.length; i++) {
            sumPow += Math.pow(num[i]-avg,2);
        }
        double pow = Math.sqrt(sumPow/n);
        for (int i = 0; i < num.length; i++) {
            double result = (num[i]-avg)/pow;
            System.out.println(result);
        }
    }
}
