package ccom.itheima.a01staticdemo1.a01staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1.����һ�����������洢ѧ������
        ArrayList<ccom.itheima.a01staticdemo1.a01staticdemo3.Student> list= new ArrayList<ccom.itheima.a01staticdemo1.a01staticdemo3.Student>();

        //2.��������ѧ������
        ccom.itheima.a01staticdemo1.a01staticdemo3.Student u1=new ccom.itheima.a01staticdemo1.a01staticdemo3.Student("����",18,"��");
        ccom.itheima.a01staticdemo1.a01staticdemo3.Student u2=new ccom.itheima.a01staticdemo1.a01staticdemo3.Student("����",19,"��");
        ccom.itheima.a01staticdemo1.a01staticdemo3.Student u3=new ccom.itheima.a01staticdemo1.a01staticdemo3.Student("����",20,"Ů");

        //3.��ѧ��������ӽ�����
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //���ù������й��ķ���
        int maxAge = ccom.itheima.a01staticdemo1.a01staticdemo3.StudentUtil.getMaxAge(list);
        System.out.println(maxAge);


    }
}
