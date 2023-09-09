package com.itheima.oop_extend.a01extenddemo1;

public class Animal {


    //权限修饰符
    //private:子类无法访问


    //注意事项:
    //子类只能访问父类中非私有的成员

    public void eat(){
        System.out.println("吃饭");
    }

    public void drink(){
        System.out.println("喝水");
    }

}
