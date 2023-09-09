package com.itheima.sockettest.server;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ServerRunnable implements Runnable {
    Properties props;
    Socket socket;

    public ServerRunnable(Socket socket,Properties prop) {
        this.socket = socket;
        this.props = prop;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String choose = br.readLine();
//                System.out.println(choose);
                switch (choose) {
                    case "login" -> {
                        login(br);
                    }
                    case "register" -> {
                        register(br);
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void register(BufferedReader br) throws IOException {
        System.out.println("用户选中注册");
        //读取传递过来用户输入的用户名和密码
        String userinfo = br.readLine();
        String usernameInput = userinfo.split("&")[0].split("=")[1];
        String passwordInput = userinfo.split("&")[1].split("=")[1];
        //设置用户名和密码的正则匹配式
        String usernameRegex = "[a-zA-Z]{6,18}";
        String passwordRegex = "[a-zA-Z]([\\d]{2,7})";

        //验证注册用户名和密码
        if (props.containsKey(usernameInput)){
            //用户名已经存在
            witerMessageToClient("1");
            return;
        }
        if (!usernameInput.matches(usernameRegex)){
            //用户名不符合规则
            witerMessageToClient("2");
            return;
        }
        if (!passwordInput.matches(passwordRegex)){
            //密码不符合规则
            witerMessageToClient("3");
            return;
        }
        //都符合规则,把用户名和密码添加到props中,并且写入到本地文件中
        props.put(usernameInput, passwordInput);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\desktop\\itheima-two\\src\\com\\itheima\\userinfo.txt"));
        Set<Map.Entry<Object, Object>> entries = props.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key+"="+value);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        witerMessageToClient("4");
        System.out.println("用户名:"+usernameInput+"密码:"+passwordInput+"注册成功");
    }

    private void login(BufferedReader br) throws IOException {
        System.out.println("用户选择登录");
        //读取传递过来用户输入的用户名和密码
        String userinfo = br.readLine();
        String usernameInput = userinfo.split("&")[0].split("=")[1];
        String passwordInput = userinfo.split("&")[1].split("=")[1];
/*        System.out.println(usernameInput);
        System.out.println(passwordInput);*/

        //验证账号密码
        if (props.containsKey(usernameInput)){
            //用户名存在,验证密码
            String rightPassword = props.get(usernameInput) + "";
            if (rightPassword.equals(passwordInput)){
                //密码正确
                System.out.println("用户名为"+usernameInput+"密码为"+passwordInput+"登录成功");
                witerMessageToClient("3");
                //把成功的socket对象添加到Server的list集合中
                Server.list.add(socket);
                //开启聊天室
                talkToAllClient(br,usernameInput);
            }else {
                //密码不正确
                System.out.println("密码不正确");
                witerMessageToClient("2");
            }
        }else {
            //用户名不存在
            System.out.println("用户名不存在");
            witerMessageToClient("1");
        }

    }

    private void talkToAllClient(BufferedReader br, String username) throws IOException {
        //循环来接收各个用户发送来的消息
        while (true){
            String message = br.readLine();
            System.out.println("用户:"+username+"发送消息:"+message);

            //群发给每个用户
            for (Socket socket : Server.list) {
                witerMessageToClient(socket,"用户:"+username+"发送消息:"+message);
            }
        }
    }

    private void witerMessageToClient(Socket socket, String message) throws IOException {
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }

    private void witerMessageToClient(String message) throws IOException {
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();

    }
}
