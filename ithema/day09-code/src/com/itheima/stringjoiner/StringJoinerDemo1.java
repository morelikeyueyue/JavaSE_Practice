package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
    /*  public stringjoiner(间隔符合)  创建一个stringjoiner对象,指定拼接的时间间隔符号
        public stringjoiner(间隔符号,开始符号,结束符号)  创建对象,指定拼接的间隔符号\开始符号\结束符号
        三个方法:add()   length()  toString()
        */

        //1.创建一个对象,并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //2.添加元素
        sj.add("sdadas");
        System.out.println(sj);
        sj.add("124");
        System.out.println(sj);

    }
}
