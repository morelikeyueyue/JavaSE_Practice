package com.itheima.commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        /*
            FileUtils类:
                copyFile 复制文件
                copyDirectory 复制文件夹
                copyDirectoryToDirectory 复制文件夹
                deletDirectory 删除文件夹
                cleanDirectory 清空文件夹
                readToString 读取文件中的数据变成字符串
                write 写出数据
             IOUtils类:
                copy 复制文件
                copyLarge 复制大文件
                readLine 读取数据
                write 写出数据
         */

        File src = new File("myio\\a.txt");
        File dest = new File("myio\\copy3.txt");
        FileUtils.copyFile(src, dest);



    }
}
