package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
      /*
          public int read(byte[] buffer)      一次读一个字节数组数据
      */

        //1.创建对象
        FileInputStream fis = new FileInputStream("myio\\a.txt");

        //2.读取数据
        byte[] btyes = new byte[2];
        //一次读取多个数据,具体读多少跟数组的长度有关
        //返回值,本地读取到了多少个字节

        int len = fis.read(btyes);
        System.out.println(len);

        String str = new String(btyes,0,len);
        System.out.println(str);

        int len1 = fis.read(btyes);
        System.out.println(len1);

        String str1 = new String(btyes,0,len1);
        System.out.println(str1);


        //3.释放资源
        fis.close();


    }
}
