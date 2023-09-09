package com.itheima.stringbuilderdemo;

public class SringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("投币");

        //2.添加元素
/*        sb.append(1);
        sb.append(2.2);
        sb.append(true);*/

        //3.反转
        sb.reverse();

        //4.获取长度
        int length = sb.length();


        //打印
        //普及:stringBuilder是java已经写好的类
        //java在底层对它进行了一些特殊处理
        //打印对象不是它的地址值而是属性值
        System.out.println(length);
        System.out.println(sb);

    }

}
