package com.itheima.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //& ����
        //���߶�Ϊ���Ϊ��
        //true
        //false
        //false
        //false
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(false&false);
        //|����
        //���߶��Ǽٽ����Ϊ��
        //true
        //true
        //true
        //false
        System.out.println(true|true);
        System.out.println(true|false);
        System.out.println(false|true);
        System.out.println(false|false);

        //^ �߼���� ��ͬΪ��,��ͬΪ��
        //false
        //true
        //true
        //false
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);

        //!ȡ��
        //false
        //true
        System.out.println(!true);
        System.out.println(!false);

    }
}
