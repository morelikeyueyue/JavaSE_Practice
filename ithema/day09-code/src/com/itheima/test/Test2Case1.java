package com.itheima.test;

import javax.xml.transform.Result;

public class Test2Case1 {
    public static void main(String[] args) {
        /*�����ַ���:
        ���������ַ��� A B
        A����ת�������ǽ�A������ߵ��ַ��ƶ������ұ�
        ��������ɴε�����A�ܱ��B,�򷵻�true ���򷵻�false
         */

        //1.���������ַ���
        String arrA = "abcde";
        String arrB = "cBeab";

        //2.��ת�ַ���
        String result=arrA;
        result = rotate(arrA);
//        System.out.println(result);

        //3.ѭ��strA.length()��
        boolean flag =check(arrA,arrB);
        System.out.println(flag);

    }

    //��ת�ַ���,�������ַ��ƶ����Ҳ�
    public static String rotate(String strA){
        //Ҫ�޸��ַ����е�����
        //1.��substring���н�ȡ,�����Ľ�ȡ����ƴ�ӵ��ұ�
        //2.���԰��ַ���ת��Ϊ�ַ�����,Ȼ������ַ��������������,����ٰ��ַ�����ת��Ϊ�ַ���


        //��ȡ�ַ���
        //��ȡ�����ַ�
        char first = strA.charAt(0);
        //��ȡʣ����ַ�
        String end = strA.substring(1);
        String result = end+first;
        return result;

    }

    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
}
