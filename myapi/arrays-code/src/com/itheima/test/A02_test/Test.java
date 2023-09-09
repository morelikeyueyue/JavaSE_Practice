package com.itheima.test.A02_test;

public class Test {
    public static void main(String[] args) {

        //特点:从第三个数据开始,是前两个数据和 (斐波那契数列)

        //求解11
        //1.创建一个长度为十二的数组
        int[] arr1 = new int[12];

        //2.手动给0索引和1索引进行赋值
        arr1[0] = 1;
        arr1[1] = 1;

        //3.利用循环给后面的数据进行赋值
        for (int i = 2; i < arr1.length; i++) {
            arr1[i] = arr1[i-1]+arr1[i-2];
        }
        //4.打印数组
        System.out.println(arr1[11]);

        //求解2:
        //递归 递归出口 递归规律

        System.out.println(getSum(12));

    }

    public static int getSum(int month){
        if (month==1||month==2) {
            return 1;
        }
        return getSum(month-1)+getSum(month-2);
    }
}
