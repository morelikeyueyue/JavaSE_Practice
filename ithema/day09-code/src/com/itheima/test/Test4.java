package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*������֤��  ����Ϊ5
        ����Ϊ5 �����Ǵ�Сд������ ��������ֻ����һλ
         */
        //1.����һ���ַ��������洢����õ����ַ�
        char[] arr = new char[5];

        //2.�õ��������ĸ
        char charLetter;
        for (int i = 0; i < 4; i++) {
            charLetter = getChar();
            arr[i] = charLetter;
        }


        //3.�õ����������
        char charNumber = getInt();
        arr[4]= charNumber;


        //4.�����ַ�����
        char[] result = changechaos(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        //5.��ӡ�ַ���
        String str = new String(result);
//        System.out.println(str);

    }
    //�õ������ĸ
    public static char getChar() {
/*        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y',
                'z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];*/

        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<26){
                arr[i] = (char)('a'+i);
//                System.out.print(arr[i]);
            }else if (i>=26) {
                arr[i] = (char)(i-26+'A');
//                System.out.print(arr[i]);
            }
        }
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];
    }


    //�õ�����
    public static char getInt(){
//        char[] arr ={'0','1','2','3','4','5','6','7','8','9'};
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(char)('0'+i);
//            System.out.print(arr[i]);
        }
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];
    }

    //�����ַ�����
    public static char[] changechaos(char[] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
