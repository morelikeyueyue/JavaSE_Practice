package com.itheima.test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        /*����
        ������������,�������ͳ���,���������,�õ���������
        ����ʹ�ó˷�\������%
         */

        //����:
        //1.�Ӽ���¼��������
        //2.ʹ��while��佫�������

        Scanner sc = new Scanner(System.in);
        System.out.println("�����뱻����:");
        int number1 = sc.nextInt();
        System.out.println("���������:");
        int number2 = sc.nextInt();
        int count = 0;

        while(number1>=number2){
            number1-= number2;
            count++;
        }
        System.out.println("��Ϊ"+count+",����Ϊ"+number1);
    }
}
