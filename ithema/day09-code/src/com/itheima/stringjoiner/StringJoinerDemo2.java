package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.��������
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.���Ԫ��
        sj.add("aaa").add("bbb").add("ccc");
        int length = sj.length();

        //3.��ӡ
        System.out.println(length);
        System.out.println(sj);


        //
        String str = sj.toString();
        System.out.println(str);

    }
}
