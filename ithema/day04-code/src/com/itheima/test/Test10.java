package com.itheima.test;

public class Test10 {
    public static void main(String[] args) {
        //一张纸0.1毫米,折叠多少次比8844430高

        //分析:
        //1.用一个数来记录纸的厚度
        //2.用一个变量来记录珠穆朗玛峰的高度
        //3.用一个数来记录折叠的次数
        //4.使用while语句
        double paper =  0.1;
        double height = 8844430;
        int count = 0;
//        System.out.println(paper);
        while (paper<height){
            paper*=2;
            count++;
        }
        System.out.println(count);
    }
}
