package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*需求
          数字加密:先得到每位数,然后每位数都加上5,再对10求余,最后将所有数字翻转,得到一串新数
         */
        //分析:
        //1.定义一个数组来存储原始数字
        int[] beginarr = {1,9,8,3};
//        int num = 12345;
//        int[] arr = new int[1];
//        arr = beginarr;
//        for (int i:arr){
//            System.out.print(i+" ");
//        }
        //静态初始化或者动态初始化短了一样可以使用,会自动填充满
//        beginarr = IntArray(num);
//        for(int i:beginarr){
//            System.out.print(i+" ");
//        }
//        2.利用方法来进行翻转
        beginarr = getArray(beginarr);
        int number=0;
        for (int i = 0; i < beginarr.length; i++) {
            System.out.println(beginarr[i]);
            number = number*10 + beginarr[i];
        }
        System.out.println(number);
    }
    //加密方法
    public static int[] getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] +5) %10;
        }
        int[] resultarr = changeArray(arr);
        return resultarr;
    }
    //翻转
    public static int[] changeArray(int[] arr){
//        int[] newarr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newarr[arr.length-1-i] = arr[i];
//        }
//        return newarr;
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    //将整数的每一位都添加到数组中去
    public static int[] IntArray(int number){
        int flag =0;
        int num = number;
        while(num!=0){
            num = num/10;
            flag ++;
//            System.out.println(num);
        }
//        System.out.println(flag);
        int[] arr = new int[flag];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-i-1] = number%10;
            number = number/10;
//            System.out.println(number);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        return arr;
    }
}
