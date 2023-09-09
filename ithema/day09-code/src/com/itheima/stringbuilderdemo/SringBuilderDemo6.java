package com.itheima.stringbuilderdemo;

public class SringBuilderDemo6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0

        sb.append("abc");
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//3

        sb.append("qwetyruasidoaipdozxjcklzlds");
        System.out.println(sb.capacity());//34
        System.out.println(sb.length());//30

        sb.append("qwetyruasidoaipdozxdsadsadadjcdsmklsajdklajsklfkss");
        System.out.println(sb.capacity());//80
        System.out.println(sb.length());//80

    }
}
