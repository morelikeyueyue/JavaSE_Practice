package com.itheima.test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模块下的aaa文件夹中创建一个a.txt文件

        //1.创建a.txt的父级路径
        File f1 = new File("myfile\\aaa");
        //2.创建父级路径
        //如果aaa存在,创建失败,方法返回false
        //如果不存在,创建成功,返回true
        f1.mkdirs();

        //3.拼接父级路径和子级路径
        File f2 = new File(f1, "a.txt");
        boolean b = f2.createNewFile();
        if (b) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }


    }
}
