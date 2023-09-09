package com.itheima.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        /*�������ֺ�����ת��

         */

        //1.�Ӽ���¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("������Ҫת��������:");
            str = sc.next();

            //2.����С�ڵ���9��������������(���巽��)
            boolean flag = checkString(str);
//            System.out.println(flag);
            if (flag) {
                //
                break;
            } else {
                //���Ϸ�
                System.out.println("��ǰ������ַ������Ϲ���,����������");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String result = changeLuoMa(c);
//            int number = c - '0';
//            String result = changeLuoMa(number);
            sb.append(result).append(" ");
        }

        System.out.println(sb);

        //���
//        ����һ������

    }

    //�ж�¼����ַ����Ƿ�Ϸ�
    public static boolean checkString(String str) {
        //����С��9
        if (str.length() > 9) {
            return false;
        }
        //ȫ��������
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
    }

    //���Ҷ�Ӧ����������(����)
    public static String changeLuoMa(int number) {
        //����һ������,���������������ֲ���һ����Ӧ��ϵ
        String[] arr = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return arr[number];
    }

    //���Ҷ�Ӧ����������(�ַ�)
    public static String changeLuoMa(char c) {
        String str =switch (c) {
            case '0' ->" ";
            case '1' ->"I";
            case '2' ->"II";
            case '3' ->"III";
            case '4' ->"IV";
            case '5' ->"V";
            case '6' ->"VI";
            case '7' ->"VII";
            case '8' ->"VIII";
            case '9' ->"IX";
            default -> str="";
        };

        return str;
    }


}
