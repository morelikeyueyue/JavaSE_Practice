package com.itheima.twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*����:
           ��ά����:
           ��̬��ʼ��
            ��������[][] ������ = new ��������[][]{{Ԫ��}{Ԫ��}};
            ��д:��������[][] ������ = {{Ԫ��},{Ԫ��}};
         */
        //1.��ά���龲̬��ʼ��
        int[][] arr1 = new int[][]{{1,2,3},{1,2,3}};
        //��ÿ��һά������дһ��
        //���һ��һά���鲻��д����
        int[][] arr2 = {
                {1,2,3,4,5,6},
                {1,2,3,4,5,9}
        };

        //2.��ȡԪ��
        System.out.println(arr2[0]); //��ʾ��ȡ��ά�����еĵ�һ��һά����
        System.out.println(arr2[0][0]);//��ȡ��һ��һά�����е�����Ԫ��

        //3.������ά����
        //��ѭ��:������ά����,�õ�����ÿһ��һλ����
        //��ѭ��:����һλ�����е�ÿһ��Ԫ��
        for (int i = 0; i < arr2.length; i++) {
            //i��ʾ��ά�����е�ÿһ������
            for (int j = 0; j < arr2[i].length; j++) {
                //j��ʾһλ�����е�ÿһ��Ԫ��
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
