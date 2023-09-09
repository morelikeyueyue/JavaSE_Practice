package com.itheima.a03loggerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class LoggerDemo1 {
    public static final Logger LOGGER= LoggerFactory.getLogger("LoggerDemo1.class");
    public static void main(String[] args) {
        //就可以记录用户的操作日志

        //登录操作
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        if ("张三".equals(username) && "123".equals(password)) {
            System.out.println("用户登录成功");
            LOGGER.info("用户于2021年11月24日 10点18分 登录,用户名为:"+username+"密码为:"+password);
        }else {
            System.out.println("用户登录失败");
            LOGGER.info("用户于2021年11月24日 10点18分 登录失败,用户名为:"+username);
        }

    }
}
