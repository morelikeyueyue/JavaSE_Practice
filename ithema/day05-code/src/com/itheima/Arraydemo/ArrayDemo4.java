package com.itheima.Arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //���鶯̬��ʼ��
        //��ʽ:  ��������[] ������ = new ��������[���鳤��];

        String[] arr1 = new String[50];

        arr1[0] = "zhangsan";
        arr1[1] = "lisi";

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);  //Ĭ�ϳ�ʼ��ֵΪ null

        //����Ĭ�ϳ�ʼֵ
        //���� 0
        //С�� 0.0
        //�ַ����� '/u000'
        //��������  false
        //������������  null

        int[] arr2 = new int[3];
        System.out.println(arr2[0]);
    }
}
