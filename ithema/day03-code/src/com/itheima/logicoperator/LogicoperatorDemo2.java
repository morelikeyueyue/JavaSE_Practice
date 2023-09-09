package com.itheima.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //1. && 短路与
        //两边都是真才为真
        //true
        //false
        //false
        //false
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        //2. || 短路或
        //两边都为假才为假
        //true
        //true
        //true
        //false
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        //3.具有短路效果,&和\左右两边都要执行
        //即左边部分慢走条件后不会运行右边部分
        int a =10;
        int b =20;
        boolean result =++a<5&&++b>5;
        System.out.println(result);//false
    }
}
