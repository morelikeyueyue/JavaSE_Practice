package com.itheima.a07mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A02_CollectionsDemo2 {
    public static void main(String[] args) {


        System.out.println("---------------sort默认规则-------------");
        //默认规则 需要重写comparable接口compareTo方法 Integer已经实现 按照从小到大排序
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,6,7,8,10,5,598);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------------sort自己指定规则-------------");
        Collections.sort(list,new Comparator<Integer>() {
            //降序
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);

        System.out.println("---------------binarySearch-------------");
        //需要元素有序
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1,2,3,4,5,6,7,8,10);
        int index = Collections.binarySearch(list1, 5);
        System.out.println(index);


        System.out.println("---------------copy-------------");
        //把list3中的元素copy到list4
        //会覆盖原来的元素
        //如果list3的长度>list4就会报错
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1,2,3,4,5,6,7);
        Collections.addAll(list4, 0,0,0,0,0,0,0,0,0,0);
        Collections.copy(list4,list3);
        System.out.println(list3);
        System.out.println(list4);


        System.out.println("---------------fill-------------");
        //把集合中现在的所有数据,都修改为指定数据
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5,1,2,3,4,5,6,7);
        Collections.fill(list5,100);
        System.out.println(list5);

        System.out.println("---------------max/min-------------");
        //求最大值或者最小值
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6,1,2,3,4,5,6,7);
        Integer max = Collections.max(list6);
        Integer min = Collections.min(list6);
        System.out.println(max);
        System.out.println(min);


        System.out.println("---------------max/min指定规则-------------");
        //string中默认按照abcd的顺序
        //现在我求最长的字符串,需要指定规则
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7,"a","bb","ccc","ffffff","dddd");
        String max1 = Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length()-o2.length());
            }
        });
        String min1 = Collections.min(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(max1);
        System.out.println(min1);

        System.out.println("---------------swap-------------");
        //交换集合中指定位置的元素
        ArrayList<Integer> list8 = new ArrayList<>();
        Collections.addAll(list8,1,2,3);
        Collections.swap(list8,0,2);
        System.out.println(list8);
    }
}
