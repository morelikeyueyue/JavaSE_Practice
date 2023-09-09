package com.itheima.oop.girlfriend;

public class GirlFriend {
    //属性

    // private 修饰符 只能在本类中才能访问
    // 可以修饰成员(成员变量和成员方法)

    // 成员变量 定义在方法外面
    // 局部变量 定义在方法里面

    // 就近原则 谁进用谁
    // this关键字

    private String name;
    private int age;
    private String gender;

    //行为
    //set 赋值

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if (age>=18&&age<=50){
            this.age =age;
        }else {
            System.out.println("非法数据");
        }
    }

    public void setGender(String gender){
        if (gender.equals("男")||gender.equals("女")){
            this.gender =gender;
        }else {
            System.out.println("非法数据");
        }
    }

    //get 获取
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }



    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
