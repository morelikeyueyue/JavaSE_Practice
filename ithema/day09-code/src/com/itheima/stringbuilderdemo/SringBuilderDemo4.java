package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class SringBuilderDemo4 {
    /*
    �Գ��ַ���:���̽���һ���ַ���,�ж��Ƿ�Գ�
   ʹ��stringbuilder��ʹ�ó���
   1.�ַ���ƴ��
   2.�ַ����ķ�ת
     */
    public static void main(String[] args) {
        //1.�Ӽ��̽���һ���ַ���
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //2.����stringbuiilder����
        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb);
        boolean result = sb.reverse().toString().equals(str);
        if (result){
            System.out.println("��ǰ�ַ����ǶԳ��ַ���");
        }else{
            System.out.println("��ǰ�ַ������ǶԳ��ַ���");
        }
        System.out.println(result);

    }

}
