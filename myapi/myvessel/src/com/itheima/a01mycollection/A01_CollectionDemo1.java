package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
/*
        public boolean add(E e)             添加
        public void clear()                 清空
        public boolean remove(E e)          删除
        public boolean contains(Object obj) 判断是否包含
        public boolean isEmpty()            判断是否为空
        public int size()                   集合长度


       注意点：
        Collection是一个接口,我们不能直接创建他的对象。
        所以，现在我们学习他的方法时，只能创建他实现类的对象。
        实现类：ArrayList
*/
        //目的:为了学习collection接口里面的方法
        //自己在做一些练习的时候,还是按照之前的方式去创建对象
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //细节1:如果我们要往list系列中添加数据,那么方法永远返回true,因为list系列的是允许元素重复的
        //细节2:如果我们要往set系列里面添加,如果元素不存在返回true,如果存在返回false,表示添加失败
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //.2.清空集合
//        coll.clear();
        System.out.println(coll);

        //3.删除
        //注意:因为collection里面定义的是共性的方法,不能通过索引进行删除,只能通过元素的对象进行删除
        //细节:方法会有一个boolean类型的返回值,删除成功返回true,删除失败返回false
        coll.remove("aaa");
        System.out.println(coll);

        //4.判断当前的元素是否包含
        //细节1:底层是依赖equals方法进行判断是否存在的
        //所以,如果存储的是自定义对象,也想通过contains方法来判断是否包含,那么在javabean类中,一定要重写equals方法
        boolean result = coll.contains("bbb");
        System.out.println(result);

        //5.判断当前集合是否为空
        boolean empty = coll.isEmpty();
        System.out.println(empty);


        //6.获得集合长度
        System.out.println(coll.size());

    }



}
