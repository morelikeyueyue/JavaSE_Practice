package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    /*
    ��Ʒ�۸�Ϊ1000,ʵ��vip��Ա��
    һ����Ա9��,������Ա8��.������Ա7��,�ǻ�Ա������
     */

    public static void main(String[] args) {
        //����
        //1.����һ������
//        float price = 1000;
        int price = 1000;

        //2.�Ӽ���¼���Ա�ĵȼ�
        Scanner sc = new Scanner(System.in);
        System.out.println("������vip�ĵȼ�:");
        int vip = sc.nextInt();
        if (vip > 0 && vip < 4) {
            if (vip == 1) {
                System.out.println("ʵ��֧����ǮΪ:"+price * 0.9);
            } else if (vip == 2) {
                System.out.println("ʵ��֧����ǮΪ:"+price * 0.8);
            } else if (vip == 3) {
                System.out.println("ʵ��֧����ǮΪ:"+price * 0.7);
            }
        } else {
            System.out.println("�����vip�ȼ�������");
        }
    }
}
