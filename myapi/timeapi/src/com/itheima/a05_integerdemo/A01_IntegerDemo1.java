package com.itheima.a05_integerdemo;

public class A01_IntegerDemo1 {
    public static void main(String[] args) {
         /*
            public Integer(int value) 根据传递的整数创建一个Integer对象
            public Integer(String s) 根据传递的字符串创建一个Integer对象
            public static Integer valueOf(int i) 根据传递的整数创建一个Integer对象
            public static Integer valueof(String s) 根据传递的字符串创建一个Integer对象
            public static Integer valueof(String s, int radix) 根据传递的字符串和进制创建一个Integer对象
        */

        //1.利用构造方法获取Integer的对象(JDK5以前的方式)
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);


        //2.利用静态方法获取对象(JDK5)
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123",8);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);


        //3.这两种方式获取对象的区别
        //因为实际开发中 -128~127之间的数据用的比较多
        //如果每次都new对象 那么太浪费内存了
        //所有,java提前把这个范围之内的每一个数据都创建好对象,如果用到就不会创建新的,而是返回已经创建好的对象
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6==i7);

        Integer i12 = Integer.valueOf(128);
        Integer i13 = Integer.valueOf(128);
        System.out.println(i12==i13);

        Integer i8 = new Integer(127);
        Integer i9 = new Integer(127);
        System.out.println(i8==i9);

        Integer i10 = new Integer(128);
        Integer i11 = new Integer(128);
        System.out.println(i10==i11);


    }
}
