package com.itheima.test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        /*需求：
             定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
	        （暂时不需要考虑子文件夹）
        */

        //1.创建file对象
        File file = new File("D:\\aaa");
        //2.得到该文件夹的
        boolean result = haveAVI(file);
        System.out.println(result);
    }

    /**
     * 作用:用来查找某一个文件夹中是否存在以avi结尾的电影
     * 形参:要查找的文件
     * 返回值:存在返回true,不存在返回false
     * @param file
     * @return
     */
    public static boolean haveAVI(File file) {
        //1.进入aaa文件夹,并且获取所有内容
        File[] files = file.listFiles();
        //2.遍历数组,获取里面每一个元素
        for (File f : files) {
            if (f.isFile()&&f.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
