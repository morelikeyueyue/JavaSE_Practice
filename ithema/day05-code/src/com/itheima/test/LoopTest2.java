package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {

        //����������Ĵ��벻�ܷ���ѭ����

        //1.����1~100֮�����
        Random r = new Random();
        int num = r.nextInt(100)+1;
        //����������������� 7~15
        //1.�������Χͷβ����ȥһ��ֵ,�������Χ��0��ʼ -7 0~8
        //2.β�ͼ�һ 8+1=9
        //3.���յĽ���ټ��ϼ�ȥ�Ľ��
//        int num1 = r.nextInt(9)+7;
//        System.out.println(num);


        //2.���������
        Scanner sc = new Scanner(System.in);
//        System.out.println("��������µ�����:");
//        int guessnumber = sc.nextInt();
        int count = 0;

        while(true){
            System.out.println("��������µ�����:");
            int guessnumber = sc.nextInt();
            count++;
            if (count == 3){
                System.out.println("�¶���");
                break;
            }
            if(guessnumber > num){
            System.out.println("�´���");
        }else if(guessnumber < num){
            System.out.println("��С��");
        }else {
            System.out.println("�¶���");
            break;
        }
        }

    }
}
