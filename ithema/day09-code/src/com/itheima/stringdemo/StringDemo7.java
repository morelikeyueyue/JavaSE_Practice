package com.itheima.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        String str = reverserString("abc");
        System.out.println(str);
//        String str1 =reverser("abc");
//        System.out.println(str1);
    }
    //要干嘛:实现字符串反转
    //需要什么:需要一个字符串
    //是否返回:需要返回
    public static String reverserString(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            //i依次表示字符串的每一个索引(倒)
            char c = str.charAt(i);
//            System.out.println(c);
            result+=c;
        }
        return result;
    }
    //引入StringBuilder使用方法
    public static String reverser(String str){
        StringBuilder strBuild = new StringBuilder(str);
        strBuild.reverse();
        String result = strBuild.toString();
        return result;
    }
}
