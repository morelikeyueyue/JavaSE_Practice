package com.itheima.a04mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        ListUtil.addAll2(list, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list);


        ArrayList<Integer> list1 = new ArrayList<>();
        ListUtil.addAll(list1, 1, 5, 3, 4);
        ListUtil.addAll2(list1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12, 13);
        System.out.println(list1);
    }
}
