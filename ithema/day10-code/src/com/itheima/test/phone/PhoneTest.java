package com.itheima.test.phone;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        //���ص���3000���ֻ�����Ϣ
        //1.��������
        ArrayList<Phone> list = new ArrayList<>();

        //2.�����ֻ�����
        Phone p1 = new Phone("С��",1000);
        Phone p2 = new Phone("ƻ��",8000);
        Phone p3 = new Phone("����",2999);

        //3.��ӵ�list������
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.�õ�С��3000���ֻ�����
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list,3000);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone ph = phoneInfoList.get(i);
            System.out.printf("�ֻ�Ʒ��Ϊ:%s\n�ֻ��۸�Ϊ:%d\n", ph.getBrand(), ph.getPrice());
        }
//        System.out.println(phoneInfoList);

    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list,int money) {
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone ph = list.get(i);
            if (ph.getPrice()<money){
                result.add(ph);
            }
        }
        return result;
    }
}
