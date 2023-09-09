package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
            键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            //判断是否超过200
            if (getSum(list)) {
                break;
            }
            //没超过,继续添加
            System.out.println("请输入添加的数据");
            String numStr = sc.nextLine();
            int number = Integer.parseInt(numStr);
            //判断数据是否合法
            if (number<1||number>100){
                System.out.println("当前数字不在1-100的范围当中,请重新输入");
                continue;
            }
            //添加数据的时候触发了自动装箱
            list.add(number);
        }
        System.out.println("数组中的总和已经超过200");
    }

    private static boolean getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum =sum+ list.get(i);
        }
        if (sum>200){
            //超过
            return true;
        }
        System.out.println("数组总和为:"+sum);
        //没超过
        return false;
    }
}
