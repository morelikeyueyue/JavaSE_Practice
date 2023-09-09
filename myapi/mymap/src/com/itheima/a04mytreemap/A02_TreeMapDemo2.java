package com.itheima.a04mytreemap;

import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A02_TreeMapDemo2 {
    public static void main(String[] args) {
        /*
        需求: 字符串 "aababcabcdabcde" 统计字符中每一个字符出现的次数 并按照以下格式输出
        a (5) b (4) c (3) d (2) e (1)


        统计 ----> 计数器
        弊端:如果我们要统计的东西多而且不确定 不方便

        新的统计思想:利用map集合进行统计:
        hashmap :没有对象结果进行排序
        treemap :题目中要求对结果进行排序
        键:统计的内容 值:次数

        */

        //1.存储字符串
        String s = "aababcabcdabcde";

        //2.创建集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //3.遍历字符串得到里面的每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //System.out.println(c);
            //拿着c在集合中判断是否存在
            if (tm.containsKey(c)) {
                //存在
                //得到之前存储的数字
                Integer count = tm.get(c);
                //增加一次
                count++;
                //把增加的结果放回集合
                tm.put(c, count);

            }else {
                //不存在
                tm.put(c,1);
            }
        }

        //4.遍历treemap集合
        //拼接 stringbuilder
        // stringjoiner
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(key).append("(").append(value).append(")");
        }

        StringJoiner sj = new StringJoiner("","","");
        tm.forEach((Character key, Integer value) -> {
                sj.add(key+"").add("(").add(value + "").add(")");
            }
        );

        //5.打印结果
        System.out.println(sb);
        System.out.println(sj);

    }
}
