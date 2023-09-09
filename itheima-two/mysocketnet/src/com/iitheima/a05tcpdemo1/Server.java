package com.iitheima.a05tcpdemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议 接收数据


        //1.创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);

        //2.监听客户端的连接
        Socket socket = ss.accept();

        //3.从连接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        int b;
        while((b=is.read())!=-1) {
            System.out.println((char)b);
        }

        //4.释放资源
        is.close();
        socket.close();
        ss.close();


    }
}
