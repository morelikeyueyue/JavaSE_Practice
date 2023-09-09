package com.itheima.myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class HutoolDemo1 {
    public static void main(String[] args) {
        /*
            FileUtil类:
                file 根据参数创建一个file文件
                touch 根据参数创建文件

                writeLines 把集合中的数据写出到文件 覆盖模式
                appendLines 把集合中的数据写出到文件 续写模式
                readLines 指定字符编码 把文件中的数据 读到集合中
                readUtf8Lines 按照UTF-8的形式,把文件中的数据 读到集合中

                copy 拷贝文件或者文件夹
         */

        File file = FileUtil.file("D:\\","ddd","bbb","a.txt");
        System.out.println(file);
        File touch = FileUtil.touch(file);
        System.out.println(touch);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        File file2 = FileUtil.writeLines(list, "D:\\aaa\\a.txt", "UTF-8");
//        File file3 = FileUtil.appendLines(list, "D:\\aaa\\a.txt", "UTF-8");
//        System.out.println(file2);
//        System.out.println(file3);

        List<String> list1 = FileUtil.readLines("D:\\aaa\\a.txt", "UTF-8");
        System.out.println(list1);

    }
}
