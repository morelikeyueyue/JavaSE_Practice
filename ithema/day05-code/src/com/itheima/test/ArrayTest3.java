package com.itheima.test;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*����:����һ������洢1~10,����ÿһ��Ԫ��
        Ҫ��:�����������������,�����ż�����ɶ���֮һ
         */

        //1.����һ������洢1~10
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //2.��forѭ����if�ж�
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr1[i] /= 2;
            } else {
                arr1[i] *= 2;
            }
        }
        //һ��ѭ��ֻ��һ������
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
