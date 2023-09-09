package com.itheima.oop_extend.a01extenddemo6;

public class Teacher extends Employee {

    public Teacher() {
    }

    public Teacher(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("ΩÃ È");
    }

}
