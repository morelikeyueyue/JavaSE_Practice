package com.itheima.test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        String[] arr = {"a","aaaa","aaa","aa"};
        //升序
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,(String o1, String o2)-> {
                return o1.length()-o2.length();
            }
        );
        System.out.println(Arrays.toString(arr));

        //降序
        Arrays.sort(arr,(String o1, String o2)-> o2.length()-o1.length());
        System.out.println(Arrays.toString(arr));

    }
}
