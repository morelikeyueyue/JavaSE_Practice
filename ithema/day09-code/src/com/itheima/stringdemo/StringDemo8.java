package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //���
        //1.�Ӽ��������ַ���
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("��������");
            money = sc.nextInt();
            if (money>=0&&money<=9999999){
                    break;
            }else {
                System.out.println("�����Ч");
            }
        }
        //2.������ת��Ϊ��д
        //����һ������������ʾǮ�Ĵ�д
        String moneyStr = "";
//        System.out.println(money);
        //�õ�money�����ÿһλ����
        int number = money;
        while (true) {
            //���������ȡ����
            int ge = number%10;
            //ȥ���ոջ�ȡ������
            number = number/10;
//            System.out.println(ge);
            String capitalNumber = getCapital(ge);
            moneyStr=capitalNumber+moneyStr;
            //��������ϵ�ÿһλ��ȫ����ȡ����,��ônumber��¼�����־���0,��ʱѭ������
            if (number==0){
                break;
            }
        }
        //3.��ǰ�油��,������λ
        moneyStr = fillString(moneyStr);
//        System.out.println(moneyStr);

        //4.���뵥λ,����һ����������ʾ��λ
        String[] arr = {"��","ʰ","��","Ǫ","��","ʰ","Ԫ"};
        //����moneyStr ���εõ�
        //Ȼ���arr�ĵ�λ�����ȥ
        String result ="";
        result = getString(moneyStr, arr, result);

        //5.��ӡ���
        System.out.println();
        System.out.println(result);

    }

    private static String fillString(String moneyStr) {
        int count =7- moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr ="��"+ moneyStr;
        }
        return moneyStr;
    }

    private static String getString(String moneyStr, String[] arr, String result) {
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result +c+ arr[i];
            System.out.print(c);
            //��ӡһ�µ�λ
            System.out.print(arr[i]);
        }
        return result;
    }

    //����һ�����������ֱ�ɴ�д������
    public static String getCapital(int number){
        //��������,�����ָ���д�����Ĳ�����ϵ
        String[] arr = {"��","Ҽ","��","��","��","��","½","��","��","��"};
        //���ؽ��
        return arr[number];
    }
}
