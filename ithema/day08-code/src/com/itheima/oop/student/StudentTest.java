package com.itheima.oop.student;

public class StudentTest {
    public static void main(String[] args) {
        //��������
        //���õĿղι���
        Student s = new Student();

        Student s1 = new Student("����",18);
        Student s2 = new Student("����");
        Student s3 = new Student(18);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        System.out.println(s3.getName());
        System.out.println(s3.getAge());

    }
}
