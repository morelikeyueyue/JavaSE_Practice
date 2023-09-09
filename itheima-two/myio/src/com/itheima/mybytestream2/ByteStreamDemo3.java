package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
         /*
             字节输入流循环读取
         */

        //1.创建对象
        FileInputStream fis = new FileInputStream("myio\\a.txt");

        /*
        * read : 表示读取数据,读取一个数据并且移动一次 */

        //2.循环读取
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        //3.释放资源
        fis.close();


    }
}
