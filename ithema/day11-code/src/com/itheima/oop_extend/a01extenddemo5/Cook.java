package com.itheima.oop_extend.a01extenddemo5;

public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String id, String name, int wages) {
        super(id, name, wages);
    }

    @Override
    public void work() {
        System.out.println("³øÊ¦ÔÚ³´²Ë");
    }
}
