package com.itheima.myobjectstream;

import java.io.Serializable;

public class Student implements Serializable {

    //固定版本号
    //第一种: private static final long serialVersionUID = 1L;
    //第二种: 对idea进行设置
    //第三种: 借鉴别 比如Arraylist
    private static final long serialVersionUID = 6764811247364898488L;
    private String name;
    private int age;
    //瞬态关键字
    //不会把这个成员变量序列化
    private transient String address;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
