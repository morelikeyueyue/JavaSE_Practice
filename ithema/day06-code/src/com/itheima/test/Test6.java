package com.itheima.test;

import java.lang.reflect.Array;

public class Test6 {
    public static void main(String[] args) {
        //����������ֵ
        //�ж�һ���������Ƿ����ĳ����,��������Żظ����ô�
        //1.��������
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //2.���÷��������ֵ
//        int max = getMax(arr);
//        System.out.println(max);
        boolean flag = isValid(arr, 5);
        System.out.println(flag);
    }

    //����������ֵ(����) ��Ҫ����
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //�ж�һ�����Ƿ����,������Żظ����ô�(����,�ж�����) ��Ҫ�Żز�������
    public static boolean isValid(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }

    //return��break������
    //return�������й� ��ʾ1�������� 2���ؽ��
    //�������ִ����return ��ô��������ȫ������,�����ѭ��Ҳ�����
    //break��ѭ���й�,��������ѭ��+
}
