package com.iitheima.a06tcpdemo2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP协议，发送数据


        //1.创建Socket对象
        //细节:在创建的时候会连接服务端,如果连接不上,代码会报错
        Socket socket = new Socket("127.0.0.1",10000);

        //2.可以从连接通道用获取输出流
        OutputStream os = socket.getOutputStream();

        //3.写入数据
        os.write("你好你好".getBytes());

        //4.释放资源
        os.close();
        socket.close();//四次挥手协议 利用这个协议断开连接 而且保证连接通道里面的数据已经处理完毕
    }
}
