package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*����:
        ��һ:�ܲ�
        �ܶ�:��Ӿ
        ����:����
        ����:���е���
        ����:ȭ��
        ����:��ɽ
        ����:�úó�һ��
         */

        //����:
        //1.�Ӽ���¼�����ڼ�
        Scanner sc = new Scanner(System.in);
        System.out.println("������������ڼ�:");
        int day = sc.nextInt();
        //2.��switch��ƥ��
        if (day > 0 && day < 8) {
            switch (day) {
                case 1:
                    System.out.println("�ܲ�");
                    break;
                case 2:
                    System.out.println("��Ӿ");
                    break;
                case 3:
                    System.out.println("����");
                    break;
                case 4:
                    System.out.println("���е���");
                    break;
                case 5:
                    System.out.println("ȭ��");
                    break;
                case 6:
                    System.out.println("��ɽ");
                    break;
                case 7:
                    System.out.println("�úó�һ��");
                    break;
                default:
                    System.out.println("��");
                    break;
            }
        }
    }
}