package com.itheima.a08regexdemo;

public class RegexDemo13 {
    public static void main(String[] args) {
        /*需求:
            将字符串:我要学学编编编编程程程程程程替换为:我要学编程
        */
        //需求:把重复的内容 替换为 单个的
        // 学学 学
        //编编编编 编
        //程程程程程程 程

        String str = "我要学学编编编编程程程程程程";
        //(.) 把重复内容的第一个内容看做一组 \\1 表示第一个字符再次出现 + 出现至少一次 $1 表示把正则表达式中第一组的内容再拿出来用

        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

    }
}
