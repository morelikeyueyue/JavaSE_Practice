package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //����:��һ����Χ��,�ܱ�������ͬʱ���������ж���

        //����:
        //1.�Ӽ���¼���������ֱ䷶Χ
        Scanner sc = new Scanner(System.in);
        System.out.println("��������������:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            int num3 = num1;
            num1 = num2;
            num2 = num3;
        }

        int sum=0;
        //2.����forѭ�������ж�ͬʱ������������
        for (int i=num1;i<=num2;i++){
//            System.out.println(i);
            if(i%3==0&&i%5==0){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
