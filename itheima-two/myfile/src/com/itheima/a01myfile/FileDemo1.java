package com.itheima.a01myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
    /*
        public File(String pathname)                根据文件路径创建文件对象
        public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象

        C:\Users\alienware\Desktop
        D:\桌面

        \:转移字符
    */
        //1.根据字符串表示的路径,变成File对象
        String str = "D:\\桌面\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);//D:\桌面\a.txt

        //2. 父级路径 C:\Users\alienware\Desktop
        // 子级路径 a.txt
        String parent = "D:\\桌面";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);//D:\桌面\a.txt

        //3.把一个file表示的路径和String表示路径进行拼接
        File parent2 = new File("D:\\桌面");
        String child2 = "a.txt";
        File f3 = new File(parent2,child2);
        System.out.println(f3);//D:\桌面\a.txt



    }
}
