package com.itheima.oop.phone;

public class PhoneTest {
    public static void main(String[] args) {
        //类:共同特征的描述(设计图)
        //对象:是真实存在的具体案例
        // 类名 对象名 = new 类名();
        Phone p = new Phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.price = 1000.98;

        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.call();
        p2.playGame();
    }
}
