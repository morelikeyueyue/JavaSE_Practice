package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //ʹ�ô���ģ��齱,��ӡ��ÿ������,�������Ҫ������Ҳ��ظ�
        //����:
        //����һ������洢����
        int[] arr1 = {2, 588, 1000, 10000};
        //����һ�����������ڴ洢�齱�Ľ��
        int[] newArr = new int[arr1.length];
        //�齱
        Random r = new Random();
//        for(int i:newArr) {
//            System.out.print(i+" ");
//        }
//        boolean flag =contains(newArr,1);
//        System.out.println(flag);
        for (int i = 0; i < 4; ) {
        int randomIndex = r.nextInt(arr1.length);
        int prize = arr1[randomIndex];
//        System.out.println(arr1[randomIndex]);
//        System.out.println(prize);
        boolean flag = contains(newArr, prize);
//        System.out.println(flag);
        if (!flag) {
            newArr[i] = prize;
            i++;
        }
        }

//        for (int i = 0; i < 5; ) {
//            //��ȡ�������
//            int randomIndex = r.nextInt(arr1.length);
//            int prize = arr1[randomIndex];
//            System.out.println(arr1[randomIndex]);
//            System.out.println(prize);
//            //�жϵ�ǰ�����Ƿ����,������������³�ȡ,������,��ʾΪ��Ч����
//            boolean flag = contains(newArr, prize);
//            System.out.println(flag);
//            if (!flag) {
//                //�ѵ�ǰ��ȡ���Ľ�����ӵ�newArr��
//                newArr[i] = prize;
//                //������֮��,�ƶ�����
//                i++;
//            }
//        }
        for (int j : newArr) {
            System.out.print(j + " ");
        }
    }

    //�ж�prize�����鵱���Ƿ����
    //���ڷ���true
    //�����ڷ���false
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
//                System.out.println(arr[i]);
//                System.out.println(prize);
                return true;
            }
        }
        return false;
    }
}
