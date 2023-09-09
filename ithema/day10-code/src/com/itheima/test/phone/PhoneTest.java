package com.itheima.test.phone;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        //返回低于3000的手机的信息
        //1.创建集合
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        //3.添加到list对象中
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.得到小于3000的手机对象
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list,3000);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone ph = phoneInfoList.get(i);
            System.out.printf("手机品牌为:%s\n手机价格为:%d\n", ph.getBrand(), ph.getPrice());
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
