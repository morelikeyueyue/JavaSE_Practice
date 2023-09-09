package com.itheima.a01myfile;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
    /*
        4.delete()             删除文件、空文件夹(不走回收站,直接删除)

        细节1:
            如果删除的是文件,则直接删除,不走回收站
            如果删除的是空文件夹,直接删除,不走回收站
            如果删除的是有内容的文件夹,则删除失败

    * */


        //1.创建file对象
        File f1 = new File("D:\\aaa\\ccc");
        //2.进行删除操作
        boolean b = f1.delete();
        System.out.println(b);

        System.out.println("--------------------------------------");
    }
}
