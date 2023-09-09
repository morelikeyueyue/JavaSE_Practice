package com.itheima.a01myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
      /*
        public boolean createNewFile()      创建一个新的空的文件
        public boolean mkdir()              创建单级文件夹
        public boolean mkdirs()             创建多级文件夹
        public boolean delete()             删除文件、空文件夹(不走回收站,直接删除)
      */


        //1.createNewFile()      创建一个新的空的文件
        //细节1:如果当前路径表示的文件是不存在的,则创建成功返回true
        //如果当前路径表示的文件则创建失败 返回false
        //细节2:如果父级路径时不存在的,那么方法会有异常IOException
        //细节3:创建的一定是文件,如果路径中不包含后缀名,则创建一个没有后缀名的文件


/*        File f1 = new File("D:\\aaa\\c.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);*/

/*        File f2 = new File("D:\\aaa\\ddd\\a.txt");//系统找不到指定的路径
        boolean b2 = f2.createNewFile();
        System.out.println(b2);*/

        System.out.println("--------------------------------------");

        //2.mkdir()              创建单级文件夹
        //细节1:windows中路径时唯一的,如果路径已经存在,则创建失败,返回false
        //细节2:mkdir 只能创建单级文件夹,无法创建多级文件夹 mkdirs可以
/*
        File f3 = new File("D:\\aaa\\aaa\\bbb\\ccc");
        boolean b1 = f3.mkdir();
        System.out.println(b1);
*/


        //3. mkdirs()             创建多级文件夹
        //细节:既可以创建单级文件夹,又可以创建多级文件夹 底层会先使用mkdir先试试
        File f4 = new File("D:\\aaa\\aaa\\bbb\\ccc");
        boolean b2 = f4.mkdirs();
        System.out.println(b2);

        System.out.println("--------------------------------------");





    }
}
