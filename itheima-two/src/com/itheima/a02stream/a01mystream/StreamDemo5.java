package com.itheima.a02stream.a01mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法

        Stream.of("aaa","bbb","ccc","ddd","eee").forEach(s -> System.out.println(s));

        Stream.of(1,2,3,4,5,6,7).forEach(i-> System.out.println(i));


    }
}
