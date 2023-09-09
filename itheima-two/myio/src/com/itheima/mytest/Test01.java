package com.itheima.mytest;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹
        //1.创建数据源地址(要拷贝的文件夹)
        File src = new File("D:\\aaa\\aaa");
        //2.创建目的地(要拷贝到的地方)
        File dest = new File("D:\\aaa\\bbb");
        //3.调用方法进行拷贝
        copydir(src,dest);
    }

    private static void copydir(File src, File dest) throws IOException {
        //创建出路径文件夹
        dest.mkdirs();
        //1.递归,遍历数据源
        File[] files = src.listFiles();
        //2.遍历数据
        for (File file : files) {
            if (file.isFile()){
                //是文件,拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len=fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();

            }else{
                //是文件夹,递归
                copydir(file,new File(dest,file.getName()));
            }
        }

    }
}
