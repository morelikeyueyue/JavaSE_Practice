package com.itheima.oop_jurisdiction;

public class Student {
    private String name;
    private int age;
    //1.��������
    //2.д�ڳ�Աλ�ô����
    //3.����:���԰Ѷ�����췽�������ظ��Ĵ����ȡ����
    //4.ִ��ʱ��:�����ڴ�����������ʱ��,��ִ�� ��������,��ִ�й��췽��


    static{
        System.out.println("��̬�����ִ����");
    }

    public Student() {
        System.out.println("�ղι���");
    }

    public Student(String name, int age) {
        System.out.println("�вι���");
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
