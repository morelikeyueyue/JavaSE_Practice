package com.itheima.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        //ʹ�ô���ģ��齱,��ӡ��ÿ������,�������Ҫ������Ҳ��ظ�
        //����:
        //����һ������洢����

        //1.�ѽ�����������н������˳��
        int[] arr= {2,588,888,1000,10000};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //��ȡ�������
            int randomIndex = r.nextInt(arr.length);
            //����i����������ϵ�ֵ���н���
            int temp=arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //2.��������,��0������ʼ��ȡÿһ������
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
