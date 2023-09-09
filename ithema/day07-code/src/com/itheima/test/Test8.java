package com.itheima.test;

public class Test8 {
    //���ֽ���
    public static void main(String[] args) {
        //1.����һ������
        int[] arr = {8, 3, 4, 6};
        arr = changeArray(arr);
        arr = sortArray(arr);
        int num = company(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(num);
    }

    //��ת
    public static int[] changeArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    //�����ж�0~4֮���10,5~9֮�����ֲ���
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] += 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        return arr;
    }

    //�������е�ÿһλƴ�ӳ�����
    public static int company(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        return number;
    }
}