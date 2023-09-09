package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PtintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
          字节打印流:
            构造方法:
                PrintStream(OutputStream/file/String) 关联字节输出流/文件/文件路径
                PrintStream(OutputStream out,Charset charset) 指定字符编码
                PrintStream(OutputStream out,boolean autoFlush) 自动刷新
                PrintStream(OutputStream out,boolean autoFlush,string encoding) 指定字符编码且自动刷新
            成员方法:
                witre(int b) 常规方法
                println(Xxx xx) 特有方法:打印任意数据,指定刷新,自动换行
                print(Xxx xxx) 特有方法:打印任意数据,不换行
                printf(String fomat,Object... args) 特有方法:带有占位符的打印语句,不换行
         */
        //1.创建字节打印流的对象
        PrintStream ps = new PrintStream(new FileOutputStream("myio\\print.txt"),true, Charset.forName("UTF-8"));
        //2.写出数据
        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s", "阿珍","阿强");
        //3.释放资源
        ps.close();


    }
}
