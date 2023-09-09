package com.itheima.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*需求:生成10个1`100之间的数随机数存入数组中
        (1)求出所有数据的和
        (2)求所有数的平均数
        (3)共计有多少个数比平均数小
         */

        //1.定义一个数组,长度为10
        int[] a = new int[10];
        Random r = new Random();
        //2.利用ramdon随机生成数字赋给每一个元素
        for (int i = 0; i < a.length; i++) {
            int number = r.nextInt(100) + 1;
            a[i] = number;
        }
        System.out.println("数组内的十个值为:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //3.利用for循环求和
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("数组总和为:"+sum);
        //4.定义一个double类型的数来存放平均值
        double avg = sum/a.length;
        System.out.println("平均值为:"+avg);
        //5.利用for循环和if判断多少个数比平均数小
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(avg>a[i]){
                count++;
            }
        }
        System.out.println("有"+count+"个数比平均值小");
    }
}
