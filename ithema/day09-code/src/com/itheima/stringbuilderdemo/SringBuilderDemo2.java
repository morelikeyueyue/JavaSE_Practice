package com.itheima.stringbuilderdemo;

public class SringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();


        //2.添加字符串
/*        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");*/
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);

        //3.再把stringbuilder变回字符串
        String str = sb.toString();
        System.out.println(str);


    }
}
