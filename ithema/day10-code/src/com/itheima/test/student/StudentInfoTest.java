package com.itheima.test.student;

import java.util.ArrayList;

public class StudentInfoTest {
    public static void main(String[] args) {
        //1.��������
        ArrayList<StudenInfo> list = new ArrayList<>();


        //2.����ѧ������
        StudenInfo s1 = new StudenInfo("����",18);
        StudenInfo s2 = new StudenInfo("����",20);
        StudenInfo s3 = new StudenInfo("����",19);


        //3.���Ԫ��
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.��������
        for (int i = 0; i < list.size(); i++) {
            StudenInfo stu = list.get(i);
            System.out.printf("����Ϊ:%s,����Ϊ:%d\n", stu.getName(), stu.getAge());
        }

    }
}
