package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        /*

            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

         */

        String str = toBinaryString(123);
        System.out.println(str);
        System.out.println(Integer.toBinaryString(123));


    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        while (true){
            if (number==0){
                break;
            }
            //获取余数
            int remaindar = number %2;
            //倒着拼接 插入0索引的前面
            sb.insert(0, remaindar);
            //将数字变成一半
            number /= 2;
        }
    return sb.toString();
    }

}
