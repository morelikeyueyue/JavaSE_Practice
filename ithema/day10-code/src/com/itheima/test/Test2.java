package com.itheima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //������ֲ����б���
       /* �����������Ͷ�Ӧ�İ�װ��
        byte Byte
        short Short
        char Character
        int Integer
        long Long
        float Float
        double Double
        boolean Boolean
        */

        //1.��������
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();

        //2.���Ԫ��
        //jdk5�Ժ� int Integer ֮���ǿ��Ի���ת����
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list1.add('c');
        list1.add('b');
        list1.add('a');

        //3.��������
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {
            if (i == list1.size() - 1) {
                System.out.print(list1.get(i));
            } else {
                System.out.print(list1.get(i) + ", ");
            }
        }
        System.out.println("]");

    }
}
