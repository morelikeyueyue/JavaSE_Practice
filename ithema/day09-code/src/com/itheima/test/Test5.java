package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*����:�����������ַ�����ʽ��ʾ�ķǸ�����num1��num2,����num1��num2�ĳ˻�
                ���ǵĳ˻�Ҳ��ʾΪ�ַ�����ʽ
         */

        //1.���������ַ����洢����
        String str1 = "678";
        String str2 = "1234";

        //2.���ַ���ת��Ϊ����(���÷���)
        int num1 = stringToInt(str1);
        int num2 = stringToInt(str2);
        System.out.println(num1);
        System.out.println(num2);
        int ride =num1*num2;

        //���÷������˻�ת��Ϊ�ַ���
        String result = intToString(ride);
        System.out.println(result);


    }

    //���ַ���ת��Ϊ����
    public static int stringToInt(String str){
        //����һ���������洢��ֵ�����
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[i] = c - '0';
        }
        int result =0;
        for (int i = 0; i < arr.length; i++) {
            result=result*10+arr[i];
        }
        return result;
    }

    //������ת��Ϊ�ַ���
    public static String intToString(int value){
        //����һ��stringbuilder��������ַ�
        StringBuilder sb = new StringBuilder();
        while (value!=0){
            int temp = value%10;
            char c =(char) (temp +'0');
            value/=10;
            sb.append(c);
//            System.out.println(c);
        }
        sb.reverse();
        String result = sb.toString();

        return result;
    }

}
