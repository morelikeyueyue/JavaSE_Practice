package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*����
          ���ּ���:�ȵõ�ÿλ��,Ȼ��ÿλ��������5,�ٶ�10����,����������ַ�ת,�õ�һ������
         */
        //����:
        //1.����һ���������洢ԭʼ����
        int[] beginarr = {1,9,8,3};
//        int num = 12345;
//        int[] arr = new int[1];
//        arr = beginarr;
//        for (int i:arr){
//            System.out.print(i+" ");
//        }
        //��̬��ʼ�����߶�̬��ʼ������һ������ʹ��,���Զ������
//        beginarr = IntArray(num);
//        for(int i:beginarr){
//            System.out.print(i+" ");
//        }
//        2.���÷��������з�ת
        beginarr = getArray(beginarr);
        int number=0;
        for (int i = 0; i < beginarr.length; i++) {
            System.out.println(beginarr[i]);
            number = number*10 + beginarr[i];
        }
        System.out.println(number);
    }
    //���ܷ���
    public static int[] getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] +5) %10;
        }
        int[] resultarr = changeArray(arr);
        return resultarr;
    }
    //��ת
    public static int[] changeArray(int[] arr){
//        int[] newarr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newarr[arr.length-1-i] = arr[i];
//        }
//        return newarr;
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    //��������ÿһλ����ӵ�������ȥ
    public static int[] IntArray(int number){
        int flag =0;
        int num = number;
        while(num!=0){
            num = num/10;
            flag ++;
//            System.out.println(num);
        }
//        System.out.println(flag);
        int[] arr = new int[flag];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-i-1] = number%10;
            number = number/10;
//            System.out.println(number);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        return arr;
    }
}
