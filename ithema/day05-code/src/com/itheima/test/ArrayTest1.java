package com.itheima.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        //����:����һ������洢1~5,���

        //1.����һ������洢1~5
        int[] arr1 = {1, 2, 3, 4, 5};
        //2.����forѭ���������
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);
    }
}
