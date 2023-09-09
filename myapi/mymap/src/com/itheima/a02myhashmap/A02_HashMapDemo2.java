package com.itheima.a02myhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

public class A02_HashMapDemo2 {
    public static void main(String[] args) {
        //1.需要先让同学们投票
        //定义一个数组,存储四个景点
        String[] arr = {"A", "B", "C", "D"};
        //利用随机数模拟80个同学的投票,并把投票结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            //System.out.println(arr[index]);
            list.add(arr[index]);
        }

        //2.如果要统计的东西比较多,不方便使用计数器思想
        //我们可以定义map集合,利用集合进行统计
        HashMap<String, Integer> map = new HashMap<>();
        //遍历list集合
        for (String name : list) {
            //判断当前的景点在map集合中是否存在
            if (map.containsKey(name)) {
                //存在
                //先获取当前景点已经被投票的次数
                Integer count = map.get(name);
                //投票数加一
                count++;
                //将新的投票数添加到map集合中
                map.put(name,count);
            }else{
                //不存在
                map.put(name, 1);
            }
        }

        //3.遍历map集合
        //求最大值
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (max<value){
                max = value;
            }
            System.out.println(key+"="+value);
        }
        System.out.println("------------");

        //4.判断哪个景点跟最大值一样,一样就打印出来
        int finalMax = max;
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                if (finalMax == value){
                    System.out.println(key+"="+value);
                }
            }
        });


    }
}
