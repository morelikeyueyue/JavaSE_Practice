package com.itheima.a05objectsdemo;

import java.util.Objects;

public class ObjectsDdemo1 {
    public static void main(String[] args) {

        //static equals(object a, object b) 先做非空判断,再比较两个对象
        // static isNull(object obj)  判断对象是否为null 是则返回true
        // static nonNull(object obj) 判断对象是否为null 是则返回false


        // 1.创建学生类的镀锡
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        //2.比较两个对象的属性值是否相同
/*        if (s1!=null ){
            boolean result = s1.equals(s2);
            System.out.println(result);
        }else {
            System.out.println("调用者为空");
        }*/

        boolean result = Objects.equals(s1,s2);
        System.out.println(result);
        //细节:方法的底层会判断s1是否为null 是null直接返回false 然后用 s1调用object里面的equals方法
        //如果重写了 比较属性值 如果没重写 ,比较地址值




        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));

        System.out.println("-------------");
        System.out.println(Objects.nonNull(s3));
        System.out.println(Objects.nonNull(s4));





    }
}
