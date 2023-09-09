package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*default尽量不省略
         */

        /* case穿透:
        拿着小括号里面的值跟下面每一个case都进行匹配
        如果匹配上了,会执行对应的语句体,如果此时发现了break语句则结束整个switch语句
        如果没有发现break,那么程序会执行下一个case的语句体,一直到break语句或者大括号
         */
        int number = 10;
        switch (number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1,10,20");
                break;
        }
    }
}
