package com.itheima.stringdemo;

public class StringDemo6 {
    public static void main(String[] args) {
        /*需求:
        定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回
        如:int[] arr ={1,2,3};
        输出结果为[1,2,3]
         */

        int[] arr = {1,2,3,4};
        String str = arrToString(arr);
        System.out.println(str);
}
    //将int数组按照指定的格式拼接成一个字符串返回
    public static String arrToString(int[] arr) {
        if (arr == null){
            //为空
            return "";
        }
        if (arr.length == 0){
            //长度为0
            return "[]";
        }
        String resultStr = "[";
        //正常数组
        for(int i = 0; i < arr.length; i++) {
            if (i<arr.length-1) {
                resultStr += arr[i]+",";
            }else {
                resultStr += arr[i];
            }
        }
        resultStr += "]";
        return resultStr;
    }
}
