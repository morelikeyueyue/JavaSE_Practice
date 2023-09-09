package com.itheima.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //& 并且
        //两边都为真才为真
        //true
        //false
        //false
        //false
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(false&false);
        //|或者
        //两边都是假结果才为假
        //true
        //true
        //true
        //false
        System.out.println(true|true);
        System.out.println(true|false);
        System.out.println(false|true);
        System.out.println(false|false);

        //^ 逻辑异或 不同为真,相同为假
        //false
        //true
        //true
        //false
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);

        //!取反
        //false
        //true
        System.out.println(!true);
        System.out.println(!false);

    }
}
