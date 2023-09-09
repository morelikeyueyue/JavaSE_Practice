package com.itheima.test.student;

import java.util.ArrayList;

public class StudentInfoTest {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<StudenInfo> list = new ArrayList<>();


        //2.创建学生对象
        StudenInfo s1 = new StudenInfo("张三",18);
        StudenInfo s2 = new StudenInfo("李四",20);
        StudenInfo s3 = new StudenInfo("王五",19);


        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            StudenInfo stu = list.get(i);
            System.out.printf("姓名为:%s,年龄为:%d\n", stu.getName(), stu.getAge());
        }

    }
}
