package com.itheima.arithmeticperator;

public class ArithmecoperatorDemo5 {
    public static void main(String[] args) {
        //++ 和 --
        int a = 10;
        a++;//先用后加
        ++a;//先加后用
        System.out.println(a);//12
        int b = 10;
        b--;
        --b;
        System.out.println(b);//8

        int c = a++;//先把a的值赋给c再自增
        int d = ++a;//先自增再把自增之后的值赋给d
        System.out.println(c);//12
        System.out.println(d);//14
        System.out.println(a++);//14
        System.out.println(a);//15
        System.out.println(++a);//16
    }
}
