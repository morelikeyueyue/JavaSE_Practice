package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {

    public static void main(String[] args) {
        //要求,验证用户登录,总共给三次机会
        //1.用两个字符串数组来存储用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //2.定义一个变量来接收循环次数
        int flag = 0;
//        进入循环
        for (int i = 0; i < 4; i++) {
            //对flag进行判断
            if(flag>2){
                //超过三次
                System.out.println("已经错误三次,验证失败");
                break;
            }else{
                //不超过三次
//                进行输入用户名和密码
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入用户名");
                String username = sc.next();
                System.out.println(username.equals(rightUsername));
                System.out.println("请输入密码");
                String password = sc.next();
                System.out.println(password.equals(rightPassword));
                //调用判断函数
                boolean judge = judegUser(username, password,rightUsername,rightPassword);
                System.out.println(judge);
                if (!judge) {
                    //不正确
                    System.out.println("用户名或者密码不正确,请再次输入");
                    flag++;
                    if (flag==3){
                        System.out.println("您的账号被锁定,请联系管理员");
                    }else {
                        System.out.println("您还剩下" + (3 - flag) + "次机会");
                    }
                }else{
                    //正确
                    System.out.println("登录成功");
                    break;
                }
            }
        }


/*        while (flag<3){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println(username.equals(rightUsername));
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println(password.equals(rightPassword));
            //调用判断函数
            boolean judge = judegUser(username, password,rightUsername,rightPassword);
            System.out.println(judge);
            if (!judge) {
                //不正确
                System.out.println("用户名或者密码不正确,请再次输入");
                flag++;
            }else{
                //正确
                System.out.println("登录成功");
                break;
            }
        }
        if(flag==3){
            System.out.println("错误四次");
        }*/



    }

    //判断用户名和密码是正确
    //正确返回true 错误返回false
    public static boolean judegUser(String username, String password,String rightUsername,String rightPassword){
        if (username.equals(rightUsername)&&password.equals(rightPassword)){
            return true;
        }else {
            return false;
        }
    }
}
