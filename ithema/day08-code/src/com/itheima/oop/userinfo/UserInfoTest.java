package com.itheima.oop.userinfo;

/**
 * @author 25718
 */
public class UserInfoTest {

    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("hangman","123456","2579846@qq.com",'ÄÐ',18);

        user1.toString();
        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());
        System.out.println(user1.getEmail());
        System.out.println(user1.getAge());
        System.out.println(user1.getGender());


    }
}