package com.itheima.mytest;

import java.io.*;

public class Test05 {
    public static void main(String[] args) throws IOException {
           /*
                四种方式拷贝文件，并统计各自用时
           */

        long start = System.currentTimeMillis();
        //细节: 第二种和第四种最快
        // 一次读写一个字节数组(字节流 缓冲流)
        Mothed1();
        Mothed2();
        Mothed3();
        Mothed4();
        long end = System.currentTimeMillis();
        System.out.println((start-end)/1000.0 + "秒");




    }
    //1.字节流 一次读写一个字节
    private static void Mothed4() throws IOException {
        //1.创建字节流对象
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\copy.txt");
        //2.遍历拷贝
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        //3.释放资源
        fos.close();
        fis.close();
    }

    //2.字节流 一次读取一个字节数组
    private static void Mothed3() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\copy.txt");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();

    }

    //3.字节缓冲流 一次读取一个字节
    private static void Mothed2() throws IOException {
        //1.创建字节缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\aaa\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));
        //2.循环拷贝
        int b;
        while ((b = bis.read())!=-1){
            bos.write(b);
        }
        //3.释放资源
        bos.close();
        bis.close();
    }

    //4.字节缓冲流 一次读取一个字节数组
    private static void Mothed1() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\aaa\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));
        int len;
        byte[] bytes = new byte[8192];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0,len);
        }
        bos.close();
        bis.close();
    }
}
