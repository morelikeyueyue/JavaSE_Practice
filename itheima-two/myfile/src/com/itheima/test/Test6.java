package com.itheima.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
       /*
            需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
            打印格式如下：
            txt:3个
            doc:4个
            jpg:6个

        */

        File file = new File("D:\\aaa");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);


    }

    /**
     * 作用:统计一个文件夹中每种文件的个数
     * 形参:要统计的文件夹
     * 返回值:用来统计的map集合 键:后缀名,值次数
     * @param src
     */
    public static HashMap<String, Integer> getCount(File src){
        //1.定义集合用于统计
        HashMap<String, Integer> hm = new HashMap<>();
        //2.进入src文件夹
        File[] files = src.listFiles();
        //3.遍历数组
        for (File file : files) {
            //4.判断
            if (file.isFile()){
                //是文件 统计
                String[] arr = file.getName().split("\\.");
                if (arr.length>=2){
                    String endName = arr[arr.length-1];
                    if (hm.containsKey(endName)){
                        //存在 自增
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName,count);
                    }else {
                        //不存在 添加
                        hm.put(endName,1);
                    }
                }

            }else {
                //文件夹 递归
                HashMap<String, Integer> sonMap = getCount(file);
                //遍历sonMap集合,累加到hm当中
                for (Map.Entry<String, Integer> entry : sonMap.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if (hm.containsKey(key)){
                        //存在
                        int count = hm.get(key) + value;
                        hm.put(key,count);
                    }else{
                        //不存在
                        hm.put(key,value);
                    }

                }

            }
        }
        return hm;
    }

}
