package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo3 {
    /*
    if(��ϵ���ʽ){
    �����1;
    }

    else{
    �����2;
    }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������ϵ�Ǯ:");
        int money = sc.nextInt();
        if(money > 100){
            System.out.println("���������.");
        }
        else{
            System.out.println("�Ծ���ʵ�ݵ�ɳ��С��.");
        }
    }

}
