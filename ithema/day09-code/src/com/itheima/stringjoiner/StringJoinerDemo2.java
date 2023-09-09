package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        int length = sj.length();

        //3.打印
        System.out.println(length);
        System.out.println(sj);


        //
        String str = sj.toString();
        System.out.println(str);

    }
}
