package com.itheima.oop_jurisdiction;

public class Student {
    private String name;
    private int age;
    //1.构造代码块
    //2.写在成员位置代码块
    //3.作用:可以把多个构造方法里面重复的代码抽取出来
    //4.执行时机:我们在创建本类对象的时候,先执行 构造代码块,在执行构造方法


    static{
        System.out.println("静态代码块执行了");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
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
