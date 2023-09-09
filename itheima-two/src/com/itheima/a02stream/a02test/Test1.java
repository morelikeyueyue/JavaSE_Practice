package com.itheima.a02stream.a02test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
       /*
        定义一个集合，并添加一些整数  1,2,3,4,5,6,7,8,9,10
        过滤奇数，只留下偶数。
        并将结果保存起来
       */

        //1.创建ArrayList集合并添加数据
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        //2.过滤奇数,留下偶数
        List<Integer> newList = list.stream().
                filter(i -> (i % 2 == 0)).
                collect(Collectors.toList());

        System.out.println(newList);

/*        Integer[] arr = list.stream().
                filter(i -> (i % 2 == 0)).
                toArray(value -> new Integer[value]);*/


    }
}
