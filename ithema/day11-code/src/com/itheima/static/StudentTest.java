package ccom.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //1.������һ��ѧ������
        ccom.itheima.a01staticdemo1.Student.teacherName = "��ΰ��ʦ";
        ccom.itheima.a01staticdemo1.Student s1 = new ccom.itheima.a01staticdemo1.Student();
        s1.setName("����");
        s1.setAge(18);
        s1.setGender("��");
        ccom.itheima.a01staticdemo1.Student.teacherName ="��ʦ";

        s1.study();
        s1.show();

        //2.�����ڶ���ѧ������
        ccom.itheima.a01staticdemo1.Student s2 = new ccom.itheima.a01staticdemo1.Student();
        s2.setName("����");
        s2.setAge(19);
        s2.setGender("Ů");

        s2.study();
        s2.show();


    }
}
