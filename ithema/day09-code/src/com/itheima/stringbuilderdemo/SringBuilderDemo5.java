package com.itheima.stringbuilderdemo;

public class SringBuilderDemo5 {
    public static void main(String[] args) {
        //拼接字符串
        //1.定义一个数组
        int[] arr = {1,2,3};

        //2.调用方法吧数组变成字符串


/*        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        System.out.println(sb);*/
        String str =arrToString(arr);
        System.out.println(str);



    }

    //将数组变成字符串
    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}
