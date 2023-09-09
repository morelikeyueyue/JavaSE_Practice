package ccom.itheima.a01staticdemo1.a01staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1.创建一个集合用来存储学生对象
        ArrayList<ccom.itheima.a01staticdemo1.a01staticdemo3.Student> list= new ArrayList<ccom.itheima.a01staticdemo1.a01staticdemo3.Student>();

        //2.创建三个学生对象
        ccom.itheima.a01staticdemo1.a01staticdemo3.Student u1=new ccom.itheima.a01staticdemo1.a01staticdemo3.Student("张三",18,"男");
        ccom.itheima.a01staticdemo1.a01staticdemo3.Student u2=new ccom.itheima.a01staticdemo1.a01staticdemo3.Student("李四",19,"男");
        ccom.itheima.a01staticdemo1.a01staticdemo3.Student u3=new ccom.itheima.a01staticdemo1.a01staticdemo3.Student("王五",20,"女");

        //3.将学生对象添加进数组
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用工具类中国的方法
        int maxAge = ccom.itheima.a01staticdemo1.a01staticdemo3.StudentUtil.getMaxAge(list);
        System.out.println(maxAge);


    }
}
