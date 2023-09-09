package com.itheima.a08regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {

        //字符类
        //只能是a  b c
        System.out.println("---------1---------------");
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false
        System.out.println("aa".matches("[abc][abc]"));//true
        //不能出现 a  b c
        System.out.println("---------2---------------");
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true
        System.out.println("zz".matches("[^abc]"));//false
        System.out.println("za".matches("[^abc][^abc]"));//false

        //a~z A~Z(包括头尾)
        System.out.println("---------3---------------");
        System.out.println("a".matches("[a-zA-z]"));//true
        System.out.println("z".matches("[a-zA-z]"));//true
        System.out.println("zz".matches("[a-zA-z]"));//false
        System.out.println("0".matches("[a-zA-z]"));//false

        //[a-d[m-p]] a到d 或者m-p
        System.out.println("---------4---------------");
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("m".matches("[a-d[m-p]]"));//true
        System.out.println("zz".matches("[a-d[m-p]]"));//false
        System.out.println("0".matches("[a-d[m-p]]"));//false

        //[a-z&&[def]] a-z和def的交集
        //细节:如果要求两个范围的交集,那么需要写符号&&
        //如果写成了一个&,那么此时&不表示交集,而是一个简单的&符号
        System.out.println("---------5---------------");
        System.out.println("a".matches("[a-z&&[def]]"));//false
        System.out.println("d".matches("[a-z&&[def]]"));//true
        System.out.println("zz".matches("[a-z&&[def]]"));//false
        System.out.println("0".matches("[a-z&&[def]]"));//false

        //[a-z&&[^bc]] a到d 和非bc的交集 等同于 [ad-z]
        System.out.println("---------6---------------");
        System.out.println("a".matches("[a-z&&[^bc]]"));//true
        System.out.println("b".matches("[a-z&&[^bc]]"));//false
        System.out.println("zz".matches("[a-z&&[^bc]]"));//false
        System.out.println("0".matches("[a-z&&[^bc]]"));//false


        //[a-z&&[^m-p]] a到d 和非(m-p)的交集 等同于 [a-lp-z]
        System.out.println("---------7---------------");
        System.out.println("a".matches("[a-z&&[^m-p]]"));//true
        System.out.println("m".matches("[a-z&&[^m-p]]"));//false


    }
}
