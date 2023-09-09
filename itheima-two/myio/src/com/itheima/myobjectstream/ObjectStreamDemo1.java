package com.itheima.myobjectstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;


/**
 * Seriallizable接口里面是没有抽象方法,标记性接口
 * 一旦实现了这个接口,那么表示当前的Student类可以被序列化
 */


public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
           需求：
                利用序列化流/对象操作输出流，把一个对象写到本地文件中

           构造方法：
                public ObjectOutputStream(OutputStream out)         把基本流变成高级流

           成员方法：
                public final void writeObject(Object obj)           把对象序列化（写出）到文件中去

        */
        //小细节:
        //使用对象输出流将对象保存到文件时会出现NotSeriallizableException异常
        //解决方案:让javabean实现Seriallizable接口

        //1.创建对象
        Student s1 = new Student("zhangsan",23);

        //2.创建序列化流的对象\对象操作输出流
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myio\\object.txt"));

        //3.写出数据
        os.writeObject(s1);

        //4.释放资源
        os.close();

    }
}
