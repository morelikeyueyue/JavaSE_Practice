package com.iitheima.a08test2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        //客户端：发送一条数据，接收服务端反馈的消息并打印
        //服务器：接收数据并打印，再给客户端反馈消息

        //1.创建Socket对象并连接服务器
        Socket socket = new Socket("127.0.0.1", 10000);

        //2.写出数据
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();

        System.out.println("请输入您要发送的消息:");
        String str = sc.nextLine();
        os.write(str.getBytes());

        //写出一个结束标记
        socket.shutdownOutput();


        //3.接收服务器端回写的数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }


        //3.释放资源
        socket.close();


    }
}
