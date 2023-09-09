package com.itheima.a06args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //计算n个数据的和
        int[] arr = {1, 2, 3, 4};
        System.out.println(getSum(arr));




    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
