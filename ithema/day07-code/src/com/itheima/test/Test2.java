package com.itheima.test;

import java.util.Scanner;

/**
 * @author 25718
 */
public class Test2 {
//             ctrl+alt+M  �Զ���ȡ����
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ʊ��:");
        double salePrice = sc.nextDouble();
        System.out.println("�������·�:");
        int month =sc.nextInt();
        System.out.println("������ͷ�Ȳջ��߾��ò�:");
        String seat = sc.next();
        double sale = salePrice * judgeMonth(month,seat);
        System.out.println(sale);
    }

    //�ж��·�
    public static double judgeMonth(int month, String seat) {
        String str1 = "���ò�";
        String str2 = "ͷ�Ȳ�";
        boolean flag1=seat.equals(str1);
        boolean flag2 = seat.equals(str2);
        return extracted(month, flag1, flag2);
    }

    private static double extracted(int month, boolean flag1, boolean flag2) {
        if(month >=5&& month <=10){
            if(flag1){
                return 0.9;
            }else if (flag2){
                return 0.95;
            }else{
                System.out.println("��λ�������");
                return 0;
            }

        }else if (month <=5&& month >=1|| month <=12&& month >=11){
            if(flag1){
                return 0.7;
            }else if (flag2){
                return 0.65;
            }else{
                System.out.println("��λ�������");
                return 0;
            }
        }else {
            System.out.println("�·��������");
            return 0;
        }
    }
}
