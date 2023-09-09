package com.itheima.a01myfile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo9 {
    public static void main(String[] args) {
        /*
        public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
        public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
      */

        //1.创建File对象
        File f = new File("D:\\aaa");
        // 调用listFiles(FileFilter filter)
        File[] arr = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr));


        //listFiles(FilenameFilter filter)
        File[] arr3 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(dir);
                System.out.println(name);
                File f = new File(dir,name);
                return f.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));

    }
}
