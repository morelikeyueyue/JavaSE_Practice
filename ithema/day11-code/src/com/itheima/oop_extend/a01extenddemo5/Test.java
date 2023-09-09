package com.itheima.oop_extend.a01extenddemo5;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Manager m = new Manager("heima001","zahngsan",15000,8000);
        System.out.println(m.getId()+","+m.getName()+","+m.getWages()+","+m.getBouns());

        m.work();
        m.eat();


        Cook c = new Cook();
        c.setId("heima002");
        c.setName("lisi");
        c.setWages(8000);
        System.out.println(c.getId() + ","+c.getName() + ","+c.getWages());

        c.work();
        c.eat();
    }
}
