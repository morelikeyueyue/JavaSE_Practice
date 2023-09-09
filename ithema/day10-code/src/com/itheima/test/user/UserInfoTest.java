package com.itheima.test.user;

import java.util.ArrayList;

public class UserInfoTest {
    public static void main(String[] args) {
        //1.定义list
        ArrayList<UserInfo> list = new ArrayList<>();

        //2.创建三个用户对象
        UserInfo u1= new UserInfo("001","zhangsan","123");
        UserInfo u2= new UserInfo("002","lisi","1234");
        UserInfo u3= new UserInfo("003","wangwu","12345");

        //3.添加到list集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //3.定义一个方法通过id来查找对应的用户信息
        UserInfo result = selectId("004", list);
        if (result!=null) {
            System.out.printf("用户id为:%s\n用户名字为:%s\n用户密码为:%s\n",result.getId(),result.getUsername(),result.getPassword());
        }else {
            System.out.println("输入id有误,未查询到该用户");
        }


    }


    //通过id来找到用户
    private static UserInfo selectId(String id,ArrayList<UserInfo> list) {
        UserInfo user;
        for (int i = 0; i < list.size(); i++) {
            user = list.get(i);
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
