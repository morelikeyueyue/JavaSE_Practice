package com.itheima.skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        //1.����ĳһ��ѭ��
        for (int i = 0; i < 10; i++) {
            if (i==3){
                //��������ѭ��,�����´�ѭ��
                continue;
            }
            System.out.println("С�ϻ��ڳԵ�"+i+"������");
        }
    }
}
