package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //����:����¼��Ů���ľ���,�������2��,�����˸�����Ӧ,��������Ӧ

        /*if��ʽ
        if(��ϵ���){
          �����;
        }
         */

        /*����
        1.�Ӽ���¼��Ů���ľ���
        2.��дif������,�Ծ��������ж�
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ů���ľ���:");
        int wine = sc.nextInt();
        if (wine > 2) {
            System.out.println("С����,�治��!");
        }
    }
}
