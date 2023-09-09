package com.itheima.a08regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //预定义字符
        // . 任何字符 \d 一个数字[0-9]  \D 非数字[^0-9] \s 一个空白字符 [\t\n\xOB\f\r] 只有一个
        // \S  非空白字符 [^\s]  \w [a-zA-Z_0-9] 英文 数字 下划线 \W [^\w] 一个非单词字符
        // \ 转义字符 改变后面那个字符原本的含义


       // 练习 以字符串的形式打印一个双引号
        // \ 转义字符 改变了后面双引号的原本你的含义 把他变成了普普通通的字符
//        System.out.println("\"\"");
        //  \\ 前面的\是一个转义字符 改变了后面\原本的含义 把他变成了一个普普通通的\而已

        // . 表示任何一个字符
        System.out.println("-------1------------");
        System.out.println("你".matches("."));//true
        System.out.println("你a".matches("."));//false

        // \\d表示任意的一个数字 \\ 两个\ 表示一个 \
        // \\D表示不为数字
        System.out.println("-------2------------");
        System.out.println("0".matches("\\d"));//true
        System.out.println("a".matches("\\d"));//false
        System.out.println("333".matches("\\d\\d\\d"));//true
        System.out.println("0".matches("\\D"));//false
        System.out.println("a".matches("\\D"));//true

        System.out.println("-------3------------");
        // \\w表示一个单词字符 [a-zA-Z_0-9]  \\W 表示一个非单词字符 [^a-zA-Z_0-9]
        System.out.println("z".matches("\\w"));//true
        System.out.println("你".matches("\\w"));//false
        System.out.println("0".matches("\\w"));//true
        System.out.println("z".matches("\\W"));//false
        System.out.println("你".matches("\\W"));//true
        System.out.println(".".matches("\\W"));//true

        // 必须是数字 字母 下划线 至少是6位
        System.out.println("-------4------------");
        System.out.println("221264656faasfd".matches("\\w{6,}"));//true
        System.out.println("221".matches("\\w{6,}"));//false

        //必须是数字和字符 必须是4位
        System.out.println("-------5------------");
        System.out.println("23df".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23_f".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23ddsaf".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23df".matches("[\\w&&[^_]]{4}"));//true
        System.out.println("23df".matches("[\\w&&^_]{4}"));//false

    }
}
