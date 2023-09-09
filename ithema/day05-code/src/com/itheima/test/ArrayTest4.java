package com.itheima.test;

public class ArrayTest4 {
    public static void main(String[] args) {
        //求数组中的最大值
        //求最小值
        //为了提升效率,循环的开始条件可以写1

        //1.定义数组
        int[] arr1 = {33,5,22,44,55};
        //2.定义一个变量max来存储最大值
        //最好直接用第一个数,不定义别的数
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if(max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println(max);

        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if(min >arr1[i]){
                min = arr1[i];
            }
        }
        System.out.println(min);
    }
}
