package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        /*����:
        ��Ϸ���߹�:������һ�����ֿ�ʼ����,����Ҫ����������ְ����߻�����7�ı�����ʱ��Ҫ˵��,
        �ڿ���̨�д�ӡ����Ҫ��������
         */

        //����:
        //��λ����,ʮλ����,�ߵı���
        //1.�õ�1~100֮�������
        for(int i=0; i<=100;i++){
            if(i%10==7 || i/10==7 || i%7==0){
                System.out.println(i+"��");
                continue;
//                System.out.println("��");
            }
            System.out.println(i);
        }
    }
}
