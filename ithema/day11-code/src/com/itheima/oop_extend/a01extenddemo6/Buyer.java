package com.itheima.oop_extend.a01extenddemo6;

public class Buyer extends Tutor{
    public Buyer() {
    }

    public Buyer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work(){
        System.out.println("�ɹ�רԱ�ڲɹ�");
    }
}
