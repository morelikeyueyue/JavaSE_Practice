package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*����:����һ������洢1~10,
        ͳ�������ж��ٸ�Ԫ���ܱ������� */

        //1.����һ������洢1~10
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //2.����forѭ��
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            //3.��if�ж��Ƿ�������3
            if (arr1[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
