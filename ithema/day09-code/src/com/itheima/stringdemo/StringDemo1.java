package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.ʹ��ֱ�Ӹ�ֵ�ķ�ʽ��ȡһ���ַ�������
        String s1 = "abc";
        System.out.println(s1);

        //2.ʹ��new�ķ�ʽ��ȡһ���ַ�������
        //�ղι���:���Ի�ȡһ���հ׵��ַ�������
        String s2 = new String();
        System.out.println("@" + s2 + "!");  //""

        //����һ���ַ���,���ݴ��ݵ��ַ����е������ٴ���һ���µ��ַ���
        String s3 = new String("abc");
        System.out.println(s3);

        //����һ���ַ�������,�����ַ�������������ٴ���һ���µ��ַ�������
        //����:��Ҫ�޸��ַ��������� abc  qbc
        //abc --> {'a','b','c'}-->{'q','b','c'} -->"qbc"
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s4 = new String(chs);
        System.out.println(s4);

        //����һ���ֽ�����,�����ֽ�����������ٴ���һ���µ��ַ�������
        //Ӧ�ó���:�Ժ��������д����������ʵ�����ֽ���Ϣ
        //����һ��Ҫ���ֽ���Ϣ����ת��,ת��Ϊ�ַ���,��ʱ��Ҫ�õ����������
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);

    }
}
