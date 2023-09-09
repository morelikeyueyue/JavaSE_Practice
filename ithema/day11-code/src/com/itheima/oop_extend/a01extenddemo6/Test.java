package com.itheima.oop_extend.a01extenddemo6;

public class Test {
    public static void main(String[] args) {
        //创建对象 讲师
        LEcturer l = new LEcturer();
        l.setId("001");
        l.setName("zhangsan");
        l.setWork("讲师01");

        l.work();

        System.out.println(l.getId()+","+l.getName()+","+l.getWork());



        //创建对象 助教
        Tutor t = new Tutor();
        t.setId("002");
        t.setName("李四");
        t.setWork("助教01");

        t.work();

        System.out.println(t.getId()+","+t.getName()+","+t.getWork());

        //创建对象 维护专员
        Maintainer m= new Maintainer();
        m.setId("003");
        m.setName("王五");
        m.setWork("维护专员01");

        m.work();

        System.out.println(m.getId()+","+m.getName()+","+m.getWork());

        //创建对象 采购专员
        Buyer b = new Buyer("004","王二麻子","采购专员01");

        b.work();

        System.out.println(b.getId()+","+b.getName()+","+b.getWork());


    }
}
