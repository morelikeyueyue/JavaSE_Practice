package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //����:�ж�һ�����ǲ�������

        //����:
        //1.�Ӽ���¼��һ����
        Scanner sc = new Scanner(System.in);
        System.out.println("��������:");
        int num = sc.nextInt();
        boolean flag =true;

        //2.�ж��Ƿ�������������
        if(num ==1){
            System.out.println("��������");
        }
        else{
            for(int i = 2; i < num; i++) {
                if(num%i==0){
                    flag = false;
//                    System.out.println("�ⲻ������");
//                    break;
                }
            }
            if(flag){
                System.out.println("����һ������");
            }else{
                System.out.println("�ⲻ��һ������");
            }
        }
    }
}
