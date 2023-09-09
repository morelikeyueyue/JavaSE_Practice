package com.itheima.myiotest7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
       /*
        需求：写一个登陆小案例。

        步骤：
            将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
            保存格式为:username=zhangsan&password=123
            让用户键盘录入用户名和密码
                    比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
                    如果不一致则打印登陆失败
        */

        //1.从本地文件中得到用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\src\\com\\itheima\\myiotest7\\userinfo.txt"));
        String line = br.readLine();
        br.close();
        String[] userInfo = line.split("&");
        String username = userInfo[0].split("=")[1];
        String password = userInfo[1].split("=")[1];

        //2.让用户从键盘输入用户名和密码
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String usernameInput = sc.nextLine();
        System.out.println("请输入密码");
        String passwordInput = sc.nextLine();

        //3.比较
        if (usernameInput.equals(username)&&passwordInput.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("用户名或者密码错误");
        }

    }
}
