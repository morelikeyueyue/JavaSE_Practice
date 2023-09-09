package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //需求:设计一个方法用户数组的变量,要求变量的结果是在一行上的
        int[] arr = {1,2,3,4,5,6,7,8};
        printArray(arr);

//        System.out.println("abc"); 先打印abc再换行
//        System.out.print("abc"); 只打印abc 不换行
//        System.out.println(); 不打印任何数据,只做换行处理
    }
    //数组的遍历
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("["+arr[i]+",");
            }else if (i>0&&i<arr.length-1){
                System.out.print(arr[i]+",");
            }else{
                System.out.print(arr[i]+"]");
            }
        }
        System.out.println();
    }
}
