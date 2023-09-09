package com.itheima.a02stream.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
/*
        单列集合      default Stream<E> stream()                           Collection中的默认方法
        双列集合      无                                                   无法直接使用stream流
        数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
        一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法
*/
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "a", "b", "c", "d", "e","b","b","b");

        //获取到一条流水线,并且把集合中的数据放到流水线上
        Stream<String> stream1 = list1.stream();
        //使用终结方法打印一下流水线上的所有数据
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s:依次表示流水线上的每一条数据
                System.out.println(s);
            }
        });

        System.out.println();

        //stream1.forEach( s -> System.out.println(s));

    }
}
