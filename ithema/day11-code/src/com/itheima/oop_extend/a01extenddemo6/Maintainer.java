package com.itheima.oop_extend.a01extenddemo6;

public class Maintainer extends Tutor {
    public Maintainer() {
    }

    public Maintainer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("维护专员在维修");
    }
}
