package com.itheima.a03myarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class A01_ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");


        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

    }
}
