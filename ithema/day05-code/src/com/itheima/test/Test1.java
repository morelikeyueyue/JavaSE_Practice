package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        /*需求:
        游戏逢七过:从任意一个数字开始报数,当你要报的这个数字包含七或者是7的倍数的时候都要说过,
        在控制台中打印逢七要过的数字
         */

        //分析:
        //个位是七,十位是七,七的倍数
        //1.得到1~100之间的数字
        for(int i=0; i<=100;i++){
            if(i%10==7 || i/10==7 || i%7==0){
                System.out.println(i+"过");
                continue;
//                System.out.println("过");
            }
            System.out.println(i);
        }
    }
}
