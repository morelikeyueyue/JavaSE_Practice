package com.itheima.oop.student;

public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public Student(){
        System.out.println("������ִ������?");
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name){
        this.name = name;
    }

    public Student(int age){
        this.age = age;
    }

}
