package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {


        //1.创建Map对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        //细节:两个作用 添加和覆盖
        //在添加数据的时候,键不存在,直接把键值对添加到map集合中,方法返回null
        //在添加数据的时候,键已经存在,直接把原有的值覆盖并且返回
        String a = m.put("1", "a");
        //System.out.println(a);
        m.put("2", "b");
        m.put("3", "c");

        //String d = m.put("1", "d");
        //System.out.println(d);

        //删除元素 删除键值对 返回被删除的值
        String result = m.remove("1");
        System.out.println(result);

        //清空
        //m.clear();

        //判断是否包含
        //判断是否包含键
        boolean keyResult = m.containsKey("2");
        //判断是否包含值
        boolean valueResult = m.containsValue("a");
        System.out.println(keyResult);
        System.out.println(valueResult);


        //判断集合是否为空
        boolean empty = m.isEmpty();
        System.out.println(empty);

        //集合的长度
        int size = m.size();
        System.out.println(size);

        //3.打印集合
        System.out.println(m);



    }
}
