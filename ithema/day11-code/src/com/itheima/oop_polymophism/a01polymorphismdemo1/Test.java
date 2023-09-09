package com.itheima.oop_polymophism.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("zahngsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(30);

        AdminStrators admin = new AdminStrators();
        admin.setName("管理员");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);

    }

    //能接收老师\学生\管理员
    public static void register(Person p){
            p.show();
    }
}
