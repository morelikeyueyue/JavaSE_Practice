package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        //+= 等同于 a = a+b
        //规则:将左边和右边进行相加,再把结果赋给左边
        int a = 10;
        int b = 20;
        a+=b;
        System.out.println(a);
        System.out.println(b);
        //-= 等同于 a = a-b
        //规则:将左边和右边进行相减,再把结果赋给左边

        //细节
        //+= -= *= /= %= 底层都隐藏了一个强制类型转换 看左边的类型强转
        short s = 1;
        //把左边和右边进行相加,得到结果2,再赋值给左边的变量
        s+=1;
        System.out.println(s);
    }
    }
