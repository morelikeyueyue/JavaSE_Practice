package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    /*
    if(){
    }else if(){
    }else{
    }
     */
    /*����
    1.����¼��С���ĳɼ�
    2.���ݲ�ͬ�Ŀ��Գɼ�,������ͬ�Ľ���
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������С���ĳɼ�:");
        int score = sc.nextInt();

        //���쳣���ݽ����ж�У��
        //0��100���Ǻ�������
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("��һ�����г�");
            } else if (score >= 90 && score < 95) {
                System.out.println("���ֳ���һ��");
            } else if (score >= 80 && score < 90) {
                System.out.println("�ͱ��ν��һ��");
            } else {
                System.out.println("��һ��");
            }
        } else {
            System.out.println("��ǰ¼��ɼ�������");
        }
    }
}