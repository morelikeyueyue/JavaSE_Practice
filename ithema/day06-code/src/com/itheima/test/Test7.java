package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //����һ������copyOfRange(int[] arr,int from,int to)
        //1.����һ����������copy
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = copyOfRange(arr1, 2, 6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }


    //���巽���������� (����,��ʼλ��,����λ��) �Ż�����
//    public static int[] copyOfRange(int[] arr, int from, int to) {
//        int[] arr2 = new int[to - from];
//        System.arraycopy(arr, from, arr2, 0, to - from);
//        return arr2;
//    }

    //α������
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] arr1 = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            arr1[index] = arr[i];//Ҳ����ʹ�� i-from
            index++;
        }
        return arr1;
    }
}