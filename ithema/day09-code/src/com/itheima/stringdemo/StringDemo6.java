package com.itheima.stringdemo;

public class StringDemo6 {
    public static void main(String[] args) {
        /*����:
        ����һ������,��int�����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ�������
        ��:int[] arr ={1,2,3};
        ������Ϊ[1,2,3]
         */

        int[] arr = {1,2,3,4};
        String str = arrToString(arr);
        System.out.println(str);
}
    //��int���鰴��ָ���ĸ�ʽƴ�ӳ�һ���ַ�������
    public static String arrToString(int[] arr) {
        if (arr == null){
            //Ϊ��
            return "";
        }
        if (arr.length == 0){
            //����Ϊ0
            return "[]";
        }
        String resultStr = "[";
        //��������
        for(int i = 0; i < arr.length; i++) {
            if (i<arr.length-1) {
                resultStr += arr[i]+",";
            }else {
                resultStr += arr[i];
            }
        }
        resultStr += "]";
        return resultStr;
    }
}
