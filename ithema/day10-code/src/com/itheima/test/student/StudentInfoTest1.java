package com.itheima.test.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoTest1 {
    public static void main(String[] args) {
        //1.��������
        ArrayList<StudenInfo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //����¼�벢�Ҽ��뼯��
        for (int i = 0; i < 3; i++) {
            StudenInfo stu = new StudenInfo();
            System.out.println("������ѧ��������:");
            String name = sc.next();
            System.out.println("������ѧ��������:");
            int age = sc.nextInt();
            stu.setAge(age);
            stu.setName(name);
            list.add(stu);

        }

        //4.��������
        for (int i = 0; i < list.size(); i++) {
            StudenInfo stu = list.get(i);
            System.out.printf("����Ϊ:%s,����Ϊ:%d\n", stu.getName(), stu.getAge());
        }

    }
}
