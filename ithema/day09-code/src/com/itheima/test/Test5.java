package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*需求:给定两个以字符串形式表示的非负整数num1和num2,返回num1和num2的乘积
                它们的乘积也表示为字符串形式
         */

        //1.定义两个字符串存储整数
        String str1 = "678";
        String str2 = "1234";

        //2.将字符串转换为整数(调用方法)
        int num1 = stringToInt(str1);
        int num2 = stringToInt(str2);
        System.out.println(num1);
        System.out.println(num2);
        int ride =num1*num2;

        //调用方法将乘积转换为字符串
        String result = intToString(ride);
        System.out.println(result);


    }

    //将字符串转换为整数
    public static int stringToInt(String str){
        //定义一个数组来存储拆分的数字
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[i] = c - '0';
        }
        int result =0;
        for (int i = 0; i < arr.length; i++) {
            result=result*10+arr[i];
        }
        return result;
    }

    //将数字转换为字符串
    public static String intToString(int value){
        //定义一个stringbuilder类来添加字符
        StringBuilder sb = new StringBuilder();
        while (value!=0){
            int temp = value%10;
            char c =(char) (temp +'0');
            value/=10;
            sb.append(c);
//            System.out.println(c);
        }
        sb.reverse();
        String result = sb.toString();

        return result;
    }

}
