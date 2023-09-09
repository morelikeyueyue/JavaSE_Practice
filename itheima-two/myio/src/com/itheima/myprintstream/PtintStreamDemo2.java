package com.itheima.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PtintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        字符打印流: 底层有缓冲区,想要自动刷新要手动开启
            构造方法:
                PrintWrite(OutputStream/file/String) 关联字节输出流/文件/文件路径
                PrintWrite(OutputStream out,Charset charset) 指定字符编码
                PrintWrite(OutputStream out,boolean autoFlush) 自动刷新
                PrintWrite(OutputStream out,boolean autoFlush,string encoding) 指定字符编码且自动刷新
            成员方法:
                witre(int b) 常规方法
                println(Xxx xx) 特有方法:打印任意数据,指定刷新,自动换行
                print(Xxx xxx) 特有方法:打印任意数据,不换行
                printf(String fomat,Object... args) 特有方法:带有占位符的打印语句,不换行
         */

        //1.创建字符打印流的对象
        PrintWriter pw = new PrintWriter(new FileWriter("myio\\print.txt"),true);

        //2.写出数据
        pw.println("今天你终于叫我名字了,虽然叫错了,但是没关系,我马上改");
        pw.print(true);
        pw.println();
        pw.printf("%s爱上了%s", "阿珍","阿强");

        //3.释放资源
        pw.close();

    }
}
