package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    /*
    ����һ����Ʊ,Ʊ�����Ϊ1��100
    ����¼��һ��������ʾ��ӰƱ��Ʊ��
    ���������,��ӡ���
    ż�����ұ�,��ӡ�ұ�
     */
    public static void main(String[] args) {
        /*����:
        1.�Ӽ���¼��һ��������ʾƱ��
        2.�Ƚ�Ʊ�ŵ���ż,�����������ȽϷ�
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ʊ��:");
        int ticket = sc.nextInt();
        //ֻ�е�ticket������0��100֮��ʱ2������ʵ��Ч��Ʊ
        if (ticket > 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("���");
            } else {
                System.out.println("�ұ�");
            }
        }
    }
}