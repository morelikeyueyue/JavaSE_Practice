package com.itheima.test;

public class ArrayTest6 {
    public static void main(String[] args) {
        /*����:����һ������,����1~5,������β������Ӧ��Ԫ��
        ����ǰ:1,2,3,4,5
        ������:5,4,3,2,1
         */

        //1.����һ������洢1~5
        int[] arr1 = {1,2,3,4,5};
        //2.����һ�������䵱�м�ֵ��¼
        int temp;
        int len =arr1.length;
        //3.����forѭ������λ��
//        for (int i = 0; i < len/2+1; i++) {
//            temp = arr1[i];
//            arr1[i] = arr1[len-1-i];
//            arr1[len-1-i] = temp;
//        }

        for(int i = 0,j = len-1;i<j;i++,j-- ){
            temp =arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
