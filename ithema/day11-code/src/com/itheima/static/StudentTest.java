package ccom.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建第一个学生对象
        ccom.itheima.a01staticdemo1.Student.teacherName = "阿伟老师";
        ccom.itheima.a01staticdemo1.Student s1 = new ccom.itheima.a01staticdemo1.Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");
        ccom.itheima.a01staticdemo1.Student.teacherName ="老师";

        s1.study();
        s1.show();

        //2.创建第二个学生对象
        ccom.itheima.a01staticdemo1.Student s2 = new ccom.itheima.a01staticdemo1.Student();
        s2.setName("李四");
        s2.setAge(19);
        s2.setGender("女");

        s2.study();
        s2.show();


    }
}
