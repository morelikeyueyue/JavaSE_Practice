package com.itheima.a01myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        //public File[] listFiles()       获取当前该路径下所有内容

        //细节:
        //1.当调用者File表示的路径不存在是,返回null
        //2.当调用者File表示的路径时文件时,返回null
        //3.当调用者File表示的路径为一个空文件时,返回一个长度为0的数组
        //4.当调用者File表示的路径一个有内容的文件夹时,将里面所有文件和文件夹的路径放到File数组中返回
        //5.当调用者File表示的路径是一个有隐藏文件的文件夹时,将里面所有文件和文件夹的路径放到File数组中返回,包含隐藏文件
        //6.当调用者File表示的路径是一个需要权限才能访问的文件夹时,返回null


        //1.创建File对象
        File f = new File("D:\\aaa");
        // listFiles
        //作用:获取aaa文件夹的所有内容,包括隐藏,把所有的内容放到数组中返回
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
            System.out.println(file.getName());
            System.out.println();
        }

    }
}
