package com.itheima.test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
       /* 需求：
        找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）


        套路：
            1，进入文件夹
            2，遍历数组
            3，判断
            4，判断

        */
        File src = new File("D:\\");
        findAVI(src);


    }
    public static void findAVI() {
        //获取本地所有的盘符
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAVI(f);
        }

    }

    public static void findAVI(File file){
        //1.进入文件夹file
        File[] files = file.listFiles();

        if (files==null){
            return;
        }

        //2.遍历数组,一次得到里面每一个文件或者文件夹
        for (File f : files) {
            //3.如果是文件,就可以执行题目的业务逻辑
            if (f.isFile()){
                String name = f.getName();
                if (name.endsWith(".avi")){
                    System.out.println(f);
                }
            }else {
                //4.如果是文件夹,递归
                //细节:再次调用本方法的时候,参数一定要是file的次一级路径
                findAVI(f);
            }

        }


    }

}
