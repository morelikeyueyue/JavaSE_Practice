package com.itheima.Arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.��������
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2.��ȡ���������Ԫ��
        //��ʽ:  ������[����]
        //���鳤��  ������.length
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]);
        }
        //��չ:
        //�Զ��Ŀ�����������ı�����ʽ idea
        // ������.fori
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
