package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
       /*
        方法引用（引用静态方法）
        格式
              类::方法名

        需求：
            集合中有以下数字，要求把他们都变成int类型
            "1","2","3","4","5"
       */

        //1.创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1","2","3","4","5");

        //2.常规方式
        ArrayList<Integer> list2 = new ArrayList<>();
        for (String s : list) {
            int i  = Integer.parseInt(s);
            list2.add(i);
        }

        //3.把他们都变成int类型
/*        list.stream()
                .map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        })
                .forEach(s -> System.out.println(s));*/

        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));


/*        list.stream()
                .map(FunctionDemo2::getInteger)
                .forEach(s -> System.out.println(s));*/


    }
    public static Integer getInteger(String s){
        return Integer.parseInt(s);
    }
}
