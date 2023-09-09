package com.itheima.a05myset;

import java.util.Comparator;
import java.util.TreeSet;

public class A07_TreeSetDemo3 {
    public static void main(String[] args) {
        //需求:先比较长度,再比较首字母
        //采取比较器排序



        //1.创建集合
        //o1 当前要添加的元素
        //o2 表示红黑树已经存在的元素
        //返回值 负数 左移 正数 右移 0 一样 不存
        TreeSet<String> ts = new TreeSet<>((String o1, String o2)-> {
                int i = o1.length() - o2.length();
                i= i == 0 ? o1.compareTo(o2):i;
                return i;
            }
        );

        //2.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        //3.打印集合
        System.out.println(ts);

    }
}
