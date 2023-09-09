package com.itheima.search;

public class A01_basicSearchDemo1 {
    //基本查找/顺序查找
    //核心：
    //从0索引开始挨个往后查找

    //需求：定义一个方法利用基本查找，查询某个元素是否存在
    //数据如下：{131, 127, 147, 81, 103, 23, 7, 79}
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 82;
        int index = basicSearch(number, arr);
        if (index == -1) {
            System.out.println("不存在");
        }else {
            System.out.println("存在,索引为"+index);
        }

    }
    public static int basicSearch(int number,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
