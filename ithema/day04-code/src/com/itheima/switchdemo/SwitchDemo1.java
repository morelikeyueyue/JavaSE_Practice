package com.itheima.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //��������,�人�ȸ���,����ը����,����������

        //1.���������¼��������Ե���
        String noodles = "�人�ȸ���";

        //2.�������������Switch��������ƥ��
        switch (noodles) {
            case "��������":
                System.out.println("����������");
                break;
            case "�人�ȸ���":
                System.out.println("���人�ȸ���");
                break;
            case "����ը����":
                System.out.println("�Ա���ը����");
                break;
            case "����������":
                System.out.println("������������");
                break;
            default:
                System.out.println("�Է�����");
                break;
        }
    }
}
