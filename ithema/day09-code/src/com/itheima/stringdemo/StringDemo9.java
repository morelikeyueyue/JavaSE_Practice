package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //�ֻ�������
        //1.�Ӽ��̵õ�һ��11λ���ֻ���
        Scanner sc = new Scanner(System.in);
        String phoneNumber;
        while(true){
            System.out.println("�������ֻ���:");
            phoneNumber = sc.next();
            if (phoneNumber.length()==11){
                break;
            }else {
                System.out.println("�����ֻ��Ų���ȷ");
            }
        }

        //2.��ȡ�ֻ������ǰ��λ(�ӿ�ʼ����������������ǰһλ)
        String start = phoneNumber.substring(0, 3);

        //3.��ȡ�ֻ��ŵĺ�4λ(�ӿ�ʼ�����ĺ�һλ��ĩβ)
        String end = phoneNumber.substring(7);

        //4.ƴ��
        String result = start+"****"+end;

        //5.��ӡ
        System.out.println(result);
    }
}
