package com.itheima.oop.phone;

public class PhoneTest {
    public static void main(String[] args) {
        //��:��ͬ����������(���ͼ)
        //����:����ʵ���ڵľ��尸��
        // ���� ������ = new ����();
        Phone p = new Phone();

        //���ֻ���ֵ
        p.brand = "С��";
        p.price = 1999.98;

        //��ȡ�ֻ������е�ֵ
        System.out.println(p.brand);
        System.out.println(p.price);

        //�����ֻ��еķ���
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "��Ϊ";
        p2.price = 1000.98;

        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.call();
        p2.playGame();
    }
}
