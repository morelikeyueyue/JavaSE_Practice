package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*����:
        ��ƽ����.����¼��һ�����ڵ���2������x,���㲢����x��ƽ����
        ���ֻ������������
         */

        //����:
        //1.�Ӽ���¼��һ�����ڵ���2������
        Scanner sc = new Scanner(System.in);
        System.out.println("����һ�����ڵ���2����:");
        int num = sc.nextInt();
        //2.��ƽ����
        for (int i = 1; i <= num; i++){
            if(i*i==num){
                System.out.println("ƽ����Ϊ"+i);
                break;
            }
            if(i*i >num){
                System.out.println("ƽ����Ϊ"+(i-1));
                break;
            }
        }
    }
}
