package com.itheima.Arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //利用索引对数组中的元素进行访问
        //1.获取数组里面的元素
        //格式:   数组名[索引]

        int[] arr1 = {1,2,3,4,5};
        int number = arr1[0];
        System.out.println(number);
        //获取数组中1索引上对应的数据并且打印出来
        System.out.println(arr1[1]);

        //2.把数据存储到数组当中
        //格式  数组名[索引] = 具体数据/变量;
        //一旦覆盖,之前的数据就会不见

        arr1[0] = 100;
        System.out.println(arr1[0]);
    }
}
