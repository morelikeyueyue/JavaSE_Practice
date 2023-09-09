package com.itheima.a08test;

import com.sun.jdi.Value;

import java.util.*;
import java.util.function.BiConsumer;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();


        list1.add("南京市");
        list1.add("扬州市");
        list1.add("苏州市");
        list1.add("无锡市");
        list1.add("常州市");

        list2.add("武汉市");
        list2.add("孝感市");
        list2.add("十堰市");
        list2.add("宜昌市");
        list2.add("常州市");


        list3.add("石家庄市");
        list3.add("唐山市");
        list3.add("邢台市");
        list3.add("保定市");
        list3.add("张家口市");

        String[] arr = {"江苏省", "湖北省", "河北省"};

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        hm.put(arr[0], list1);
        hm.put(arr[1], list2);
        hm.put(arr[2], list3);

        //hm.forEach((String key, ArrayList<String> value) -> System.out.println(key+"="+value));
        for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",", "", "");

            for (int i = 0; i < value.size(); i++) {
                String city = value.get(i);
/*                if (i!= value.size()-1){
                    System.out.print(s+",");
                }else {
                    System.out.println(s);
                }*/
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }

    }
}
