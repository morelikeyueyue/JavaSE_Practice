package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*����:
        1.��Ʊ��ѯ
        2.��ƱԤ��
        3.��Ʊ��ǩ
        4.�˳�����
        5.����Ҳ���˳�����
         */

        //����
        //1.�Ӽ���¼���û�ѡ��
        Scanner sc =new Scanner(System.in);
        System.out.println("�����û���ѡ��:");
        int choose = sc.nextInt();
        //2.����switch���ݲ�ͬ��ѡ��ִ�в�ͬ�Ĵ���
        switch (choose){
            case 1:
                System.out.println("��Ʊ��ѯ");
                break;
            case 2:
                System.out.println("��ƱԤ��");
                break;
            case 3:
                System.out.println("��Ʊ��ǩ");
                break;
            case 4:
                System.out.println("�˳�ϵͳ");
                break;
            default:
                System.out.println("�˳�ϵͳ");
                break;
        }
    }
}
