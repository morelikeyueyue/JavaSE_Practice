package com.itheima.printfinfo;

public class PrintfInfo {
    public static void main(String[] args) {
        String s = "sadasd";
        char c = 'a';
        int num1 = 10;
        float num2 = 20;
        double  num3 = 30.145665466;
        System.out.printf("%c", c);
        System.out.println();
        System.out.printf("%s",s);
        System.out.println();
        System.out.printf("%d",num1);
        System.out.println();
        System.out.printf("%f",num3);
        System.out.println();
        System.out.printf("%E",num3);
        System.out.println();
        System.out.printf("%.2f",num3);
        System.out.println();
        System.out.printf("%s%n", "next line");// %n ��ʾ����
        System.out.printf("%s = %s%n", "Name", "Regino");// %n ������֧�ֶ������
        System.out.printf("%S = %s%n", "Name", "Regino");// %S ���ַ����Դ�д��ʽ���
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "ino", "Reg");// ֧�ֶ������ʱ��������%s֮����������ţ�1$��ʾ��һ���ַ�����3$��ʾ��3���ַ���
    }
}
