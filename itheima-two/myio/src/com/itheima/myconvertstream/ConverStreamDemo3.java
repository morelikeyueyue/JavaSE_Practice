package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConverStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
            将本地文件中的GBK文件，转成UTF-8
        */

/*        //1.JDK11以前的方案
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\gbkfile.txt"),"GBK");
        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("myio\\utf8.txt"),"UTF-8");

        int b;
        while((b=isr.read())!=-1){
            osr.write(b);
        }
        osr.close();
        osr.close();*/


        //2.JDK1以后的方案
        FileReader fr = new FileReader("myio\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("myio\\utf.txt",Charset.forName("UTF-8"));
        int b;
        while ((b = fr.read())!=-1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
