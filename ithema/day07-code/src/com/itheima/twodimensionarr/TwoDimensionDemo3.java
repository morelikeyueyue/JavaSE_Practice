package com.itheima.twodimensionarr;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /*����:
        һ����:22,66,44
        ������:77,33,88
        ������:25,45,65
        �ļ���:11,66,99
         */

        //1.������ά���鲢�Ҵ洢����
        int[][] yearArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum =0;
        //2.������ά����,�õ�ÿһ��һά���鲢�����
        for (int i = 0; i < yearArr.length; i++) {
            //i ��ά�����е�ÿһ������
            //yearArr[i] Ԫ��(һλ����)
            int sum = getSum(yearArr[i]);
//            int[] quarterArr = yearArr[i];
//            int sum = getSum(quarterArr);
            System.out.println("��"+(i+1)+"�����ȵ���Ӫҵ��Ϊ:"+sum);
            yearSum+=sum;
        }
        System.out.println("ȫ�����Ӫҵ��Ϊ"+yearSum);

    }

    //����һ������,����ÿһ�����ȵ�Ӫҵ��
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
