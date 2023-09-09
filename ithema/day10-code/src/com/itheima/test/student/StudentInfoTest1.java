package com.itheima.test.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoTest1 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<StudenInfo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //键盘录入并且加入集合
        for (int i = 0; i < 3; i++) {
            StudenInfo stu = new StudenInfo();
            System.out.println("请输入学生的姓名:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            int age = sc.nextInt();
            stu.setAge(age);
            stu.setName(name);
            list.add(stu);

        }

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            StudenInfo stu = list.get(i);
            System.out.printf("姓名为:%s,年龄为:%d\n", stu.getName(), stu.getAge());
        }

    }
}
