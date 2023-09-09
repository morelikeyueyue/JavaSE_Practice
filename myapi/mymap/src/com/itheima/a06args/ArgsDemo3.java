package com.itheima.a06args;

public class ArgsDemo3 {
    public static void main(String[] args) {
        //JDK 5
        //可变参数
        //方法形参的个数是可以编号的 0 1 2 3 ...
        //格式 属性类型 ...名字
        System.out.println(getSum(1, 2, 3, 4, 5));
    }

    //底层:
    //可变参数的底层就是一个数组而已
    //只不过不需要我们自己创建,java会帮我们创建

    public static int getSum(int ...args){
        //System.out.println(args);
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
