package com.itheima.myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
         * 获取class对象的三种方式：
         *   1. Class.forName("全类名");
         *   2. 类名.class
         *   3. 对象.getClass();
         *
         * */

        //1.第一种  Class.forName("全类名");
        //全类名 : 包名 + 类名 com.itheima.myreflect1.Student
        Class clazz1 = Class.forName("com.itheima.myreflect1.Student");

        //第二种 类名.class
        Class clazz2 = Student.class;

        //第三种 对象.getClass()
        Student s = new Student();
        Class clazz3 = s.getClass();


        //打印
        System.out.println(clazz2==clazz3);
        System.out.println(clazz2==clazz1);

    }
}
