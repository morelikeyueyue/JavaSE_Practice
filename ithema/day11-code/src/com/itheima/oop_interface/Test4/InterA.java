package com.itheima.oop_interface.Test4;

public interface InterA {
    public static void show1() {
        System.out.println("show1������ʼִ����");
        show4();
    }

    public default void show2() {
        System.out.println("show2������ʼִ����");
        show3();
    }

    private void show3() {
        System.out.println("��¼���������й����еĸ���ϸ��,������100�д���");
    }

    private static void show4() {
        System.out.println("��¼���������й����еĸ���ϸ��,������50�д���");
    }
}
