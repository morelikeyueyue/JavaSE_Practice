package com.itheima.oop_extend.a01extenddemo6;

public class Test {
    public static void main(String[] args) {
        //�������� ��ʦ
        LEcturer l = new LEcturer();
        l.setId("001");
        l.setName("zhangsan");
        l.setWork("��ʦ01");

        l.work();

        System.out.println(l.getId()+","+l.getName()+","+l.getWork());



        //�������� ����
        Tutor t = new Tutor();
        t.setId("002");
        t.setName("����");
        t.setWork("����01");

        t.work();

        System.out.println(t.getId()+","+t.getName()+","+t.getWork());

        //�������� ά��רԱ
        Maintainer m= new Maintainer();
        m.setId("003");
        m.setName("����");
        m.setWork("ά��רԱ01");

        m.work();

        System.out.println(m.getId()+","+m.getName()+","+m.getWork());

        //�������� �ɹ�רԱ
        Buyer b = new Buyer("004","��������","�ɹ�רԱ01");

        b.work();

        System.out.println(b.getId()+","+b.getName()+","+b.getWork());


    }
}
