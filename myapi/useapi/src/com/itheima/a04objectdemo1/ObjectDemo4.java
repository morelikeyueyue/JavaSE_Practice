package com.itheima.a04objectdemo1;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //3.把A对象的属性值完全拷贝给B对象,也叫对象拷贝,对象复制

        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1 = new User(1,"zhangsan","123","girl11",data);

        //克隆方法
        User u2 = (User) u1.clone();
        System.out.println(u1);
        System.out.println(u2);

        //验证object里面的clone是浅克隆


        System.out.println(u1);
        System.out.println(u2);


        //深克隆 第三方工具
        //1.第三方工具导入到项目 新建lib文件 赋值 右键点击 选择添加到库
        //2.编写代码
        Gson gson = new Gson();
        //把对象变成一个字符串
        String s = gson.toJson(u1);
        System.out.println(s);
        //再把字符串变回对象
        User u3 = gson.fromJson(s, User.class);
        int[] arr = u1.getData();
        arr[0] = 100;
        //打印对象
        System.out.println(u3);

    }
}
