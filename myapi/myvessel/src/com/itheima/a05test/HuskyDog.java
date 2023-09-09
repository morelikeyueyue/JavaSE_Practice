package com.itheima.a05test;

public class HuskyDog extends Dog {
    public HuskyDog() {
    }

    public HuskyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做"+this.getName()+"的,"+this.getAge()+"的岁哈士奇,正在吃骨头,边吃边拆家");
    }
}
