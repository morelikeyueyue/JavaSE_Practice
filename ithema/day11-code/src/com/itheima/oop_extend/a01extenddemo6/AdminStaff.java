package com.itheima.oop_extend.a01extenddemo6;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work(){
        System.out.println("ÐÐÕþ²¿");
    }
}
