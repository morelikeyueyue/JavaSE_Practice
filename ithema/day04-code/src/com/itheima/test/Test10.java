package com.itheima.test;

public class Test10 {
    public static void main(String[] args) {
        //һ��ֽ0.1����,�۵����ٴα�8844430��

        //����:
        //1.��һ��������¼ֽ�ĺ��
        //2.��һ����������¼���������ĸ߶�
        //3.��һ��������¼�۵��Ĵ���
        //4.ʹ��while���
        double paper =  0.1;
        double height = 8844430;
        int count = 0;
//        System.out.println(paper);
        while (paper<height){
            paper*=2;
            count++;
        }
        System.out.println(count);
    }
}
