package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*default������ʡ��
         */

        /* case��͸:
        ����С���������ֵ������ÿһ��case������ƥ��
        ���ƥ������,��ִ�ж�Ӧ�������,�����ʱ������break������������switch���
        ���û�з���break,��ô�����ִ����һ��case�������,һֱ��break�����ߴ�����
         */
        int number = 10;
        switch (number){
            case 1:
                System.out.println("number��ֵΪ1");
                break;
            case 10:
                System.out.println("number��ֵΪ10");
                break;
            case 20:
                System.out.println("number��ֵΪ20");
                break;
            default:
                System.out.println("number��ֵ����1,10,20");
                break;
        }
    }
}
