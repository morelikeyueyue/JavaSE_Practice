package com.itheima.arithmeticperator;

public class ArithmecoperatorDemo3 {
    public static void main(String[] args) {
        int a =10;
        double b =20.0;
        //隐式转换
        //byte short char 三种类型的数据在运算是,都会直接提升至int,在进行计算
        byte c =10;
        byte d = 20;

//        System.out.println(a+b);
        //强制转换
        double e = 20.05;
        int f = (int)e;
//      System.out.println((int)b);
        System.out.println(f);
        double a1 = 20.5;
        double a2 = 20.6;
//        int a3 = (int)(a1+a2);
        int a3 = (int)a1+(int)a2;
        System.out.println(a3);
    }

}
