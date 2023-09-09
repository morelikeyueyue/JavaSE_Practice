package com.itheima.a04objectdemo1;

public class ObjectDemo1 {
    public static void main(String[] args) {

        //1.toString 返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@4eec7777

        Student stu = new Student("zhangsan",23);
        String str2 = stu.toString();
        System.out.println(str2);//com.itheima.a04objectdemo1.Student@41629346
        //细节:
        //system 类名 out 静态变量 system.out获得打印的对象 println() 方法 参数就是打印的内容
        //当我们打印一个对象的时候 底层会调用对象的tostring方法 把对象变成字符串然后再打印换行
        //我想要看见对象内部的属性值,怎么办?
        //处理方案:重写父类的tostring方法
        System.out.println(stu);//com.itheima.a04objectdemo1.Student@41629346



    }
}
