package com.itheima.test;

import java.util.Scanner;


public class Test11 {
    public static void main(String[] args) {
        //����:����һ������,�����һ��������,����ǻ�������ӡtrue,�������ӡfalse

        //����:
        //1.�Ӽ���¼������
        //2.����forѭ��Ƕ��if

        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������:");
        int num = sc.nextInt();
        String str = String.valueOf(num);
//        int length = num.length();
        for (int i = 0, k = str.length() - 1; i <= k; i++, k--) {
            do {
                if (str.charAt(i) != str.charAt(k)) {
                    System.out.println("false");
                    break;
                }

            } while (i == k);
            System.out.println("true");
        }
//        for(int i = 0,k=str.length()-1; i <= k; i++,k--) {
//            if(str.charAt(i)!=str.charAt(k)) {
//                return false;
//            }
//        }
//        return true;
    }
}
