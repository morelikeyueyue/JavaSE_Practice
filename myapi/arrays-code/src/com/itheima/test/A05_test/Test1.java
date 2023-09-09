package com.itheima.test.A05_test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
            // 小明每次可以爬1阶，2阶或者3阶 算有多少种方法来走
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();//多少个台阶
            System.out.println(f(n));

        }

    public static int f(int n) {
        if (n==0)//当最前面一次走3阶
        {
            return 1;
        }
        if (n==1)//当最前面一次走1阶
        {
            return 1;
        }
        if (n==2)//当最前面一次走2阶
        {
            return 2;
        }
        return f(n-1)+f(n-2)+f(n-3);
    }
}
