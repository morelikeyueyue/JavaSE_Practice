package com.itheima.myiotest8;

import java.io.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
       /*
        需求：写一个登陆小案例（添加锁定账号功能）

        步骤：
        	将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
        	保存格式为:username=zhangsan&password=123&count=0
        	让用户键盘录入用户名和密码
        	比较用户录入的和正确的用户名密码是否一致
        	如果一致则打印登陆成功
        	如果不一致则打印登陆失败，连续输错三次被锁定

        */
        //1.把用户名和密码从本地文件读取到内存中
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\src\\com\\itheima\\myiotest8\\userinfo.txt"));
        String line = br.readLine();
        br.close();
        String[] userInfo = line.split("&");
        String rightUsername = userInfo[0].split("=")[1];
        String rightPassword = userInfo[1].split("=")[1];
        int count = Integer.parseInt(userInfo[2].split("=")[1]);

        //2.让用户从键盘输入用户名和密码
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String usernameInput = sc.nextLine();
        System.out.println("请输入密码");
        String passwordInput = sc.nextLine();

        //3.判断用户是否可以登录
        if(usernameInput.equals(rightUsername)&&passwordInput.equals(rightPassword)&&count<3){
            count=0;
            System.out.println("登录成功");
        }else {
            if (count<3){
                System.out.println("还剩下"+(3-count)+"次机会");
                count++;
            }else {
                System.out.println("用户账号已经被锁定");
            }
        }

        //4.将登录信息重新写入到文件中
        String content = "username="+rightUsername+"&password="+rightPassword+"&count="+count;
        wirteInfo(content);

    }

    /**
     * 作用:将一个字符串写入到本地文件
     * @param content 要写入的字符串
     * @throws IOException
     */
    private static void wirteInfo(String content) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest\\src\\com\\itheima\\myiotest8\\userinfo.txt"));
        bw.write(content);
        bw.newLine();
        bw.close();
    }
}
