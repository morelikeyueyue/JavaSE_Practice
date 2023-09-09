package com.itheima.search;


import java.util.ArrayList;
import java.util.StringJoiner;

public class A01_basicSearchDemo2 {
    //课堂练习1：
    //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求：不需要考虑数组中元素是否重复


    //课堂练习2：
    //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求：需要考虑数组中元素有重复的可能性
    //{131, 127, 147, 81, 103, 23, 7, 79, 81}
    //我要查找81，想要返回的是所有索引 3 8
    public static void main(String[] args) {
        int[] arr={131, 127, 147, 81, 103, 23, 7, 79, 81,81,123,56456,8789,81};
        int number=81;
        ArrayList<Integer> index = basicSearch(number, arr);
        if (index.size()==0){
            System.out.println("不存在");
        }else {
            for (int i = 0; i < index.size(); i++) {
                int result=index.get(i);
                System.out.println("存在,索引为:"+result);
            }
        }


    }
    public static ArrayList<Integer> basicSearch(int number, int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        StringJoiner sj = new StringJoiner(",");
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
