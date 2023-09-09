package com.itheima.a02stream.a01mystream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        //数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法

        //1.创建数组
        int[] arr = {1,2,3,4,5,6,7,8,9};

        String[] arr2 = {"a","b","c"};

        //2.获取stream流
/*        Arrays.stream(arr).forEach(i -> System.out.println(i));

        Arrays.stream(arr2).forEach(s -> System.out.println(s));*/


        //Stream接口中的静态方法的细节
        //方法的形参是一个可变参数,可以传递一堆零散的数据,也可体传递数组
        //但是数组必须是引用数据类型,如果传递基本数据类型,是会把整个数组当成一个元素放到Stream里面去
        Stream.of(arr).forEach(s -> System.out.println(s));

    }
}
