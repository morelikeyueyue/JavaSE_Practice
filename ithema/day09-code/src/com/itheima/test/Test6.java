package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*����:����һ���ַ���s,�����ɵ������,����ǰ����һЩ�ո��ַ�����,����
        �ַ��������һ�����ʵĳ���
        ����:��ָ������ĸ���\�������κοո��ַ���������ַ���
         */

        //1.���ű���,ֱ�������ո�Ϊֹ
        String str = "hello world";
        int flag = 0;
        for (int i = str.length()-1; i > 0; i--) {
            char c = str.charAt(i);
            System.out.println(c);
            if(c==' '){
                if (i==str.length()-1){
                    continue;
                }else {
                    flag = str.length()-1-i;
                    break;
                }
            }
        }
        System.out.println(flag);


    }
}
