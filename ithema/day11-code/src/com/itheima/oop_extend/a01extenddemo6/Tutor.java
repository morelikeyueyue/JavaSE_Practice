package com.itheima.oop_extend.a01extenddemo6;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("Öú½ÌÔÚ±¸¿Î");
    }
}
