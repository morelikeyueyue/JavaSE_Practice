package com.itheima.test;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
       /*需求：
            统计一个文件夹的总大小
      */

        File file = new File("D:\\aaa");
        long len = getLen(file);
        System.out.println(len);


    }

    /**
     * 作用:用来统计一个文件夹的总大小
     * 参数:表示要统计的那个文件夹
     * 返回值:统计之后的结果
     * @param src
     * @return
     */
    public static long getLen(File src) {
        //1.定义变量进行累加
        long len = 0;
        //2.进入src文件夹
        File[] files = src.listFiles();
        //3.遍历数组
        for (File file : files) {
            //4.判断
            if (file.isFile()){
                //文件 累加
                len+=file.length();
            }else {
                //文件夹 递归
                len+=getLen(file);
            }
        }
        return len;
    }
}
