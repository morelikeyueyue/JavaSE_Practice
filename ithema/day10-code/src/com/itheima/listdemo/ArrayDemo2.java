package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayDemo2 {
    public static void main(String[] args) {

        //1.��������
        ArrayList<String> list = new ArrayList<>();

        // ���
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //ɾ��
//        boolean result = list.remove("ddd");

//        String remove = list.remove(1);


        //�޸�
        String remove = list.set(0, "ddd");

        //��ѯ
        String s = list.get(0);

        //��ó���
        int size = list.size();
        System.out.println(size);
        System.out.println(s);
        System.out.println(remove);
//        System.out.println(result);
        System.out.println(list);

        //����list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
