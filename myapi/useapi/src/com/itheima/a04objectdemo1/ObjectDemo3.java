package com.itheima.a04objectdemo1;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
//        false
//        false
        System.out.println(s.equals(sb));
        //因为equals方法被s调用,这里的equals看string
        //字符串里面的equals方法判断参数是否为字符串,是再继续比较内部的属性,如果不是则直接返回false

        System.out.println(sb.equals(s));
        //这里的equals看stringbuilder里面的方法
        //没有重写,调用object中的equals方法 比较地址值
    }
}
