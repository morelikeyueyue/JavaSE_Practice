package com.itheima.test;

public class Test2Case2 {
    public static void main(String[] args) {
        /*�����ַ���:
        ���������ַ��� A B
        A����ת�������ǽ�A������ߵ��ַ��ƶ������ұ�
        ��������ɴε�����A�ܱ��B,�򷵻�true ���򷵻�false
         */

        //1.���������ַ���
        String arrA = "abcde";
        String arrB = "cdeab";

        //2.��ת�ַ���
//        String result=arrA;
//        result = rotate(arrA);
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

//        "ABC"  ['A','B','C']
//        System.out.println(strA);
        char[] arr = strA.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
//            if (i== arr.length-1){
//                arr[i]=first;
//            }
        }
        arr[arr.length-1]=first;

        String result= new String(arr);
//        System.out.println(result);
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
