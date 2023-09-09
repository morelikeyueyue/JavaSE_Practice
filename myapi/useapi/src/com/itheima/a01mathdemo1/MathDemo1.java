package com.itheima.a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {

        //获取参数的绝对值
        //bug: 以int类型为例,取值范围 -2147483648 ~ 2147483647
        //如果没有正数与负数对应,那么传递负数的结果有误

        System.out.println(Math.abs(2));
        System.out.println(Math.abs(-3));
        System.out.println(Math.abs(-2.1));
        System.out.println(Math.abs(-2464));
        System.out.println(Math.abs(-2147483648));
        System.out.println(Math.abs(-2147483647));

//        System.out.println(Math.absExact(-2147483648));
        System.out.println("--------------------------------");


        //向上取整 向数轴正方向去最近整数
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.99));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0
        System.out.println(Math.ceil(-12.56));//-12.0

        System.out.println("--------------------------------");


        //向下取整 向数轴负方向去最近整数
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.99));//12.0
        System.out.println(Math.floor(-12.34));//-13.0
        System.out.println(Math.floor(-12.56));//-13.0

        System.out.println("--------------------------------");


        //四舍五入
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.99));//13
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.5));//-12
        System.out.println(Math.round(-12.51));//-13

        System.out.println("--------------------------------");

        //获取两个数的较大值
        System.out.println(Math.max(3,2));//3
        System.out.println(Math.max(3.323,245645));//3.323

        System.out.println("--------------------------------");

        //获取两个数的较小值
        System.out.println(Math.min(3,2));//2
        System.out.println(Math.min(3.323,2.45645));//2.45645

        System.out.println("--------------------------------");


        //获取a的b次幂 返回值是double  第二个数尽量传递大于等于1的数
        System.out.println(Math.pow(2, 3));//8.0
        System.out.println(Math.pow(2, 5));//32.0
        //细节:如果第二个参数是0~1之间的小数,就是开根号
        System.out.println(Math.pow(4, 0.5));//2.0
        //第二个数是负数 将第一个数的倒数再去幂
        System.out.println(Math.pow(2, -2));//0.25

        System.out.println("--------------------------------");

        //开根号 返回值都是double
        System.out.println(Math.sqrt(4));//2.0

        //开立方
        System.out.println(Math.cbrt(8));//2.0

        System.out.println("--------------------------------");

        //获取一个在[0.0,1.0)之间的double类型的随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }



    }
}
