package com.itheima.a01mathdemo1;

import java.util.Scanner;

public class MathDemo3 {
    public static void main(String[] args) {
        //自幂数:一个n位自然数等于自身各个数位上数字的n次幂之和
        //三位数 153 1^3+5^3+4^3=153
        //1位 独身数 3位 水仙花数 4位 四叶玫瑰数 5:五角星数
        //6:六合数 7:北斗七星数 8 八仙数 9 九九重阳数 10 十全十美数
        //要求1:一共有多少个水仙花数 要求2:证明没有两位的自幂数 要求3:分别统计有多四个四叶玫瑰数和五角星数(3)

        //水仙花数 100_999
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            if (judegeNumber(i)){
                //自幂数
                count++;
            }
        }
        System.out.println(count);

        //没有两位数的自幂数
        count =0;
        for (int i = 10; i < 100; i++) {
            if (judegeNumber(i)){
                count++;
            }
        }
        System.out.println(count);

        //四叶玫瑰数
        count =0;
        for (int i = 1000; i < 10000; i++) {
            if (judegeNumber(i)){
                count++;
            }
        }
        System.out.println(count);

        //五角星数
        count =0;
        for (int i = 10000; i < 100000; i++) {
            if (judegeNumber(i)){
                count++;
            }
        }
        System.out.println(count);

        //独身数
        count =0;
        for (int i = 0; i < 10; i++) {
            if (judegeNumber(i)){
                count++;
            }
        }
        System.out.println(count);

    }

    //判断一个数是不是自幂数
    public static boolean judegeNumber(int number) {
        //判断这个数是几位数
        int num = number;
        int count = 0;
        while (num>0){
            num= num /10;
            count++;
        }
        num =number;
        //拿到这个数的每一位数,倒着的
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = num%10;
            num/=10;
        }
        //定义sum来存储最后计算结果
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=Math.pow(arr[i],count);
        }
        //判断是否为自幂数
        if (sum==(double)number){
            return true;
        }
        return false;
    }
}