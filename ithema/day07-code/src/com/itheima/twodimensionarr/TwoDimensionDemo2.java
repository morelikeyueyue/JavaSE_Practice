package com.itheima.twodimensionarr;

public class TwoDimensionDemo2 {
    /*
    ��ά����Ķ�̬��ʼ��:
        ��������[][] ������ = new ��������[m][n];
        m��ʾ�����ά����,���Դ�Ŷ��ٸ�һλ����
        n��ʾÿһ��һά����,���Դ�Ŷ��ٸ�Ԫ��
     */

    public static void main(String[] args) {
        //1.���ö�̬��ʼ����ʽ������ά����
        int[][] arr = new int[3][5];
        arr[0][0] = 10;

        //2.������ά����
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr1 = new int[2][2];
        int[] a1 = {11, 22};
        int[] a2 = {44, 55, 66};
        arr1[0] = a1;
        arr1[1] = a2;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }


}
