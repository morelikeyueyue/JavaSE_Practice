package com.itheima.a01myfile;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FileDemo3 {
    public static void main(String[] args) {
     /*
        public long length()                返回文件的大小（字节数量）
        public String getAbsolutePath()     返回文件的绝对路径
        public String getPath()             返回定义文件时使用的路径
        public String getName()             返回文件的名称，带后缀
        public long lastModified()          返回文件的最后修改时间（时间毫秒值）
     */

        //1. length 返回文件的大小(字节数量)
        //细节:这个方法只能获取文件的大小,单位是字节
        //如果单位是M,G 可以不断的除以1024
        //len / 1024 KB
        // len / 1024 /1024 MB
        //细节2: 这个方法无法获取文件夹的大小
        //如果我们要获取一个文件的大小,需要把这个文件夹里面素有的文件大小都累加在一起
        File f1 = new File("D:\\aaa\\a.txt");
        long len = f1.length();
        System.out.println(len);//8

        File f2 = new File("D:\\aaa\\bbb");
        long len2 = f2.length();
        System.out.println(len2);//0

        System.out.println("--------------------------------------");

        //2. getAbsolutePath 返回文件的绝对路径
        File f3 = new File("D:\\aaa\\a.txt");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);//D:\aaa\a.txt

        File f4 = new File("a.txt");
        String path2 = f4.getAbsolutePath();
        System.out.println(path2);//D:\desktop\itheima-two\a.txt

        System.out.println("--------------------------------------");

        //3. getPath 返回定义文件时使用的路径
        File f5 = new File("D:\\aaa\\a.txt");
        String path3 = f5.getPath();
        System.out.println(path3);//D:\aaa\a.txt

        File f6 = new File("a.txt");
        String path4 = f6.getPath();
        System.out.println(path4);//a.txt

        System.out.println("--------------------------------------");

        //4. getName 返回文件名字
        //细节1:文件 返回文件名(包括后缀名)
        // a.txt a 真正的文件名 txt 文件后缀名
        //细节2:文件夹 返回文件夹的名字
        File f7 = new File("D:\\aaa\\a.txt");
        String name = f7.getName();
        System.out.println(name);//a.txt

        File f8 = new File("D:\\aaa\\bbb");
        String name2 = f8.getName();
        System.out.println(name2);//bbb

        System.out.println("--------------------------------------");

        //4. lastModified 返回文件最后修改的时间 毫秒值
        File f9 = new File("D:\\aaa\\a.txt");
        long time = f9.lastModified();
        System.out.println(time);//1676188931435

        System.out.println("--------------------------------------");

        Instant instant = Instant.ofEpochMilli(time);
        ZonedDateTime time1 = instant.atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(time1);
        System.out.println(format);


    }
}
