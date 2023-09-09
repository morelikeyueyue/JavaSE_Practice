package com.itheima.a08regexdemo;

public class RegexDemo12 {
    public static void main(String[] args) {
        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例: a123a b456b 17891 &abc& a123b(false)

        // \\组号 表示把第x组的内容在拿出来用一次
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));


        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        System.out.println("-------------2--------------");
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));

        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        // (.) 把首字母看做一组 \\1 把首字母拿出了再用一次  * 作用于\\1 表示后面的内容出现0次或者多次
        System.out.println("-------------3--------------");
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("aaa123aab".matches(regex3));


    }
}
