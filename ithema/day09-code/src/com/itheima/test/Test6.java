package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*需求:给你一个字符串s,由若干单词组成,单词前后用一些空格字符隔开,返回
        字符串中最后一个单词的长度
        单词:是指仅有字母组成\不包含任何空格字符的最大子字符串
         */

        //1.倒着遍历,直到遇到空格为止
        String str = "hello world";
        int flag = 0;
        for (int i = str.length()-1; i > 0; i--) {
            char c = str.charAt(i);
            System.out.println(c);
            if(c==' '){
                if (i==str.length()-1){
                    continue;
                }else {
                    flag = str.length()-1-i;
                    break;
                }
            }
        }
        System.out.println(flag);


    }
}
