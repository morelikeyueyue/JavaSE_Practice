package com.itheima.lambdademo;

public class LambdaDemo2 {
    public static void main(String[] args) {


        //1.利用匿名内部类的形式去调用下面的方法
        //调用的方法是一个接口的时候,那么问你要传递这个接口的实现类对象
        //如果实现类对象只要用一次,就可以使用匿名内部类

        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });

        //2.利用Lambda表达式进行改写
        method(
                ()->{
            System.out.println("正在游泳~~~~");
        }
        );




    }


    public static void method(Swim s) {
        s.swimming();
    }

}

@FunctionalInterface
interface Swim{
    public abstract void swimming();
}
