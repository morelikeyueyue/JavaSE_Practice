package com.itheima.sockettest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientRunnable implements Runnable {
    Socket socket;

    public ClientRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //循环,重复的接收服务器传递的消息
        while (true) {
            String message = null;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                message = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }

    }

}
