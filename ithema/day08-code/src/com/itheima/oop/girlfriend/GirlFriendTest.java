package com.itheima.oop.girlfriend;

public class GirlFriendTest {
    public static void main(String[] args) {
        //����Ů���ѵĶ���
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("Сʫʫ");
        gf1.setGender("Ů");
        gf1.setAge(18);

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.sleep();
        gf1.eat();

        System.out.println();

        GirlFriend gf2 = new GirlFriend();
        gf2.setName("С����");
        gf2.setGender("Ů");
        gf2.setAge( 19);

        System.out.println(gf2.getName());
        System.out.println(gf2.getGender());
        System.out.println(gf2.getAge());

        gf2.sleep();
        gf2.eat();

    }
}
