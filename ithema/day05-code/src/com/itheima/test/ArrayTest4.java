package com.itheima.test;

public class ArrayTest4 {
    public static void main(String[] args) {
        //�������е����ֵ
        //����Сֵ
        //Ϊ������Ч��,ѭ���Ŀ�ʼ��������д1

        //1.��������
        int[] arr1 = {33,5,22,44,55};
        //2.����һ������max���洢���ֵ
        //���ֱ���õ�һ����,����������
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if(max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println(max);

        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if(min >arr1[i]){
                min = arr1[i];
            }
        }
        System.out.println(min);
    }
}
