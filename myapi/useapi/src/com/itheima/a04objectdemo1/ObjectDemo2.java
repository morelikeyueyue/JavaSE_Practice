package com.itheima.a04objectdemo1;

public class ObjectDemo2 {
    public static void main(String[] args) {
        //2. 比较两个对象是否相等
        Student stu1 = new Student();
        Student stu2 = new Student();

        boolean flag = stu1.equals(stu2);

        System.out.println(flag);

//        结论:如果没有重写equals方法,默认调用object里面的,比较地址值
//        重写之后比较对象中的属性值
    }
}
