package com.itheima.sockettest.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
            控制台版聊天室
         */

        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 20000);
        System.out.println("服务器已经连接成功");

        //2.进入登录或者注册页面
        while (true) {
            System.out.println("==========欢迎来到黑马聊天室==========");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("请输入你的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            switch (choose) {
                case "1" -> {
                    System.out.println("用户选择了登录");
                    login(socket);
                }
                case "2" -> {
                    System.out.println("用户选中了注册");
                    register(socket);
                }
            }
        }

    }

    private static void register(Socket socket) throws IOException {
        //获取输入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册用户名:");
        String username = sc.nextLine();
        System.out.println("请输入注册密码:");
        String password = sc.nextLine();

        //拼接
        StringBuilder sb = new StringBuilder();
        sb.append("username=").append(username).append("&password=").append(password);


        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        //传递给服务端进行注册
        bw.write("register");
        bw.newLine();
        bw.flush();

        //再传递给服务端注册用户名和密码
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

        //接收服务端传递的反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        switch (message) {
            case "1" -> {
                System.out.println("用户名已经存在");
            }
            case "2" -> {
                System.out.println("用户名长度：6~18位，纯字母，不能有数字或其他符号");
            }
            case "3" -> {
                System.out.println("密码长度3~8位。第一位必须是小写或者大小的字母，后面必须是纯数字");
            }
            case "4" -> {
                System.out.println("注册成功");
            }
        }



    }

    private static void login(Socket socket) throws IOException {
        //获取输入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        //拼接
        StringBuilder sb = new StringBuilder();
        sb.append("username=").append(username).append("&password=").append(password);

        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        //传递给服务端进行登录
        bw.write("login");
        bw.newLine();
        bw.flush();

        //再传递给服务端用户名和密码
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

        //接收服务端传递的反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        switch (message) {
            case "1" -> {
                System.out.println("用户不存在");
            }
            case "2" -> {
                System.out.println("密码错误");
            }
            case "3" -> {
                System.out.println("登录成功,开始聊天");
                //开一条单独的线程，专门用来接收服务端发送过来的聊天记录
                new Thread(new ClientRunnable(socket)).start();
                //开启聊天
                talkToServer(bw);
            }
        }

    }

    private static void talkToServer(BufferedWriter bw) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要发送的消息:");
            String message = sc.nextLine();
            try {
                bw.write(message);
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
