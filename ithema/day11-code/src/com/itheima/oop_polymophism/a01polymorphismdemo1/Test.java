package com.itheima.oop_polymophism.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s =new Student();
        s.setName("zahngsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("������");
        t.setAge(30);

        AdminStrators admin = new AdminStrators();
        admin.setName("����Ա");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);

    }

    //�ܽ�����ʦ\ѧ��\����Ա
    public static void register(Person p){
            p.show();
    }
}
