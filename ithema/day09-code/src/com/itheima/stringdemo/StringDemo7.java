package com.itheima.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        String str = reverserString("abc");
        System.out.println(str);
//        String str1 =reverser("abc");
//        System.out.println(str1);
    }
    //Ҫ����:ʵ���ַ�����ת
    //��Ҫʲô:��Ҫһ���ַ���
    //�Ƿ񷵻�:��Ҫ����
    public static String reverserString(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            //i���α�ʾ�ַ�����ÿһ������(��)
            char c = str.charAt(i);
//            System.out.println(c);
            result+=c;
        }
        return result;
    }
    //����StringBuilderʹ�÷���
    public static String reverser(String str){
        StringBuilder strBuild = new StringBuilder(str);
        strBuild.reverse();
        String result = strBuild.toString();
        return result;
    }
}
