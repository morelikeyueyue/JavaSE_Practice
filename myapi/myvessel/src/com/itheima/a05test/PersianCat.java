package com.itheima.a05test;

public class PersianCat extends Cat{
    public PersianCat() {
    }

    public PersianCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做"+this.getName()+"的,"+this.getAge()+"的岁波斯猫,正在吃鱼");
    }
}
