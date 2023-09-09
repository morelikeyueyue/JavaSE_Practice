package com.itheima.mysort;

public class A04_RecursionDemo1 {
    public static void main(String[] args) {
        //递归排序
        //递归一定要有出口,否则就会出现内存溢出
        //作用:把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
        //两个核心:
        //找出口:什么时候不再调用方法 找规律:如何把大问题变成规模较小的问题
        method();
    }
    public static void method() {
        method();
    }
}
