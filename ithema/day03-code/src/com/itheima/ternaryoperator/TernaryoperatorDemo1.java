package com.itheima.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //����:ʹ����Ԫ�����,��ȡ�������Ľϴ�ֵ

        int num1 = 10;
        int num2 = 20;
        //����:
        /*1.�Ӽ�������������
          2.ʹ����Ԫ�������ȡ���������Ľϴ�ֵ
          3.������Ԫ���ʽ�Ľ������Ҫ��ʹ��
         */
        int max = num1>num2?num1:num2;
        System.out.println(max);
        System.out.println(num1>num2?num1:num2);
    }
}
