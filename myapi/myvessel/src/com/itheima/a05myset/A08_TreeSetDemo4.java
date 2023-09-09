package com.itheima.a05myset;

import java.util.Comparator;
import java.util.TreeSet;

public class A08_TreeSetDemo4 {
    public static void main(String[] args) {
        //1.创建学生读对象
        Student1 s1 = new Student1("zhangsan",23,90,99,50);
        Student1 s2 = new Student1("lisi",24,90,98,50);
        Student1 s3 = new Student1("wangwu",25,95,100,30);
        Student1 s4 = new Student1("zhaoliu",26,60,99,70);
        Student1 s5 = new Student1("qianqi",26,70,80,70);

        //2.创建集合对象
        //默认ArrayList 唯一set(默认hashset) 唯一排序 TreeSet
        TreeSet<Student1> ts = new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int sum1 = o1.getChinese() + o1.getMath() + o1.getEnglish();
                int sum2 = o2.getChinese() + o2.getMath() + o2.getEnglish();
                int i = sum1 - sum2;
                i=i==0? o1.getChinese()-o2.getChinese():i;
                i=i==0? o1.getMath()-o2.getMath():i;
                //i=i==0? this.getEnglish()-o.getEnglish():i;
                i=i==0? o1.getAge()-o2.getAge():i;
                i=i==0? o1.getName().compareTo(o2.getName()):i;
                return i;
            }
        });

//        TreeSet<Student1> ts = new TreeSet<Student1>();

        //3.添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //4.打印集合
        //System.out.println(ts);
        for (Student1 t : ts) {
            System.out.println(t);
        }
    }
}
