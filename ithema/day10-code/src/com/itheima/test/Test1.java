package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {


        //1.��������
        ArrayList<String> list = new ArrayList<>();

        //2.���Ԫ��
        list.add("����");
        list.add("�ղ�");
        list.add("Ͷ��");
        list.add("ת��");

        //3.����
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");

    }
}
