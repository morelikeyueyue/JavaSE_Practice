package com.itheima.sockettest.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class Server {
    static ArrayList<Socket> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        //获取本地文件中的正确的用户名和密码
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("D:\\desktop\\itheima-two\\src\\com\\itheima\\userinfo.txt");
        props.load(fis);
        fis.close();
        String string = props.toString();
        System.out.println(string);

        //1.创建ServerSocket对象
        ServerSocket ss = new ServerSocket(20000);

        //2.等待用户连接
        while (true) {
            Socket socket = ss.accept();
            //调用线程去处理
            System.out.println("有客户端来连接");
            new Thread(new ServerRunnable(socket,props)).start();
        }


    }
}
