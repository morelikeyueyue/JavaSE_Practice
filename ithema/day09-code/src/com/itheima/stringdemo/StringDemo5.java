package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        /*����:����¼��һ���ַ���,ͳ�Ƹ��ַ����Ĵ�д��ĸ\Сд��ĸ\���ֳ��ֵĴ���
         */

        //1.����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
        String str = sc.nextLine();

        //���������¼��д��ĸ����\Сд��ĸ����\��������(ͳ��----������˼��)
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        //2.�����ַ���
        for (int i = 0; i < str.length(); i++) {
            //�õ������ַ�
            char c = str.charAt(i);
            //���бȽ�
            if (c<='Z'&&c>='A') {
                bigCount++;
            } else if (c <= 'z' && c >= 'a') {
                smallCount++;
            }else if (c<='9'&&c>='0') {
                numberCount++;
            }else {
                otherCount++;
            }
        }
        //3.�����ӡ
        System.out.printf("��д��ĸ��:%d��,\nСд��ĸ��:%d��,\n������%d��,\n�����ַ���%d��\n", bigCount, smallCount,numberCount,otherCount);
    }
}
