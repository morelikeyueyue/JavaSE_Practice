package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=5;i++){
            //1.变量定义在大括号里面只对大括号里面有效
            //2.变量定义在循环里面,当本次循环结束以后,变量就会从内存里面消失
            //第二次循环开始的时候,又会从新定义一个新的变量
            sum +=i;
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
