package com.itheima.a04mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候集合如歌存储数据
        //结论:
        //如果我们没有给集合指定类型,默认所有的数据类型就是Object类型
        //此时可以往集合中添加任意的数据类型
        //带来一个坏处,在获取数据的时候,无法使用他的特有行为

        //此时推出看泛型,可以在获取数据的时候就把类型进行统一
        //而且我们在获取数据的时候爷省的强转了,非常方便


        //1.创建集合的对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加数据
        //list.add(123);
        list.add("aaa");
        //list.add(new Student("zhangsan", 123));

        //3.遍历集合,获取里面的每一个元素
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            //多态的弊端,是不能访问子类的特有功能
            System.out.println(str);
        }

    }
}
