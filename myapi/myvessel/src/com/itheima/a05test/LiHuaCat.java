package com.itheima.a05test;

public class LiHuaCat extends Cat {
    public LiHuaCat() {
    }

    public LiHuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做"+this.getName()+"的,"+this.getAge()+"的岁狸花猫,正在吃鱼");
    }
}
