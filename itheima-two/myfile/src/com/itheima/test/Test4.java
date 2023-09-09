package com.itheima.test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        /*
           删除一个多级文件夹
           如果我们要删除一个有内容的文件夹
           1.先删除文件夹里面所有的内容
           2.再删除自己
        */

        File file = new File("D:\\aaa\\src");
        deleteSRC(file);


    }

    /**
     * 作用:删除src文件夹
     * 参数:要删除的src文件夹
     * @param file
     */
    public static void deleteSRC(File file) {
        //1.先删除文件夹里面的内容
        //1.1 进入file文件夹
        File[] files = file.listFiles();
        if (files==null){
            return;
        }
        //1.2 遍历
        for (File f : files) {
            System.out.println(f.getName());
            //1.3 判断 如果是文件,删除
            if (f.isFile()){
                f.delete();
            }else {
                //1.4 判断文件夹,递归
                deleteSRC(f);
            }


        }
        //2.删除自己
        file.delete();

    }
}
