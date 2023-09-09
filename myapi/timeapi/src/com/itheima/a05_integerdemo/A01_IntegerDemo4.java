package com.itheima.a05_integerdemo;

public class A01_IntegerDemo4 {
    public static void main(String[] args) {
                /*
            public static string tobinarystring(int i) 得到二进制
            public static string tooctalstring(int i) 得到八进制
            public static string toHexstring(int i) 得到十六进制
            public static int parseInt(string s) 将字符串类型的整数转成int类型的整数
        */
        //1.把整数变成二进制,八进制,十六进制
        String str1 = Integer.toBinaryString(100);//1100100 二进制
        System.out.println(str1);

        String str2 = Integer.toOctalString(100);//144 八进制
        System.out.println(str2);

        String str3 = Integer.toHexString(100);//64 十六进制
        System.out.println(str3);

        //把字符串变成int类型的整数
        //强类型的语言,每种数据在java中都有各自的数据类型
        //在计算中,如果不是同一种数据类型,是无法直接计算的
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);
        //细节:
        //1.在类型转换的时候,括号中的参数只能是数字不能是其他,否则代码会报错
        //2.八种包装类中,出来Character都有对应的parseXXX的方法,进行类型转换

        String str = "true";
        System.out.println(!Boolean.parseBoolean(str));


    }
}
