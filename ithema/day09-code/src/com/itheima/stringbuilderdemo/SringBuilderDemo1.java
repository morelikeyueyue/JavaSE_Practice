package com.itheima.stringbuilderdemo;

public class SringBuilderDemo1 {
    public static void main(String[] args) {
        //1.��������
        StringBuilder sb = new StringBuilder("Ͷ��");

        //2.���Ԫ��
/*        sb.append(1);
        sb.append(2.2);
        sb.append(true);*/

        //3.��ת
        sb.reverse();

        //4.��ȡ����
        int length = sb.length();


        //��ӡ
        //�ռ�:stringBuilder��java�Ѿ�д�õ���
        //java�ڵײ����������һЩ���⴦��
        //��ӡ���������ĵ�ֵַ��������ֵ
        System.out.println(length);
        System.out.println(sb);

    }

}
