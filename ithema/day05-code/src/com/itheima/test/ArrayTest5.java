package com.itheima.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*����:����10��1`100֮��������������������
        (1)����������ݵĺ�
        (2)����������ƽ����
        (3)�����ж��ٸ�����ƽ����С
         */

        //1.����һ������,����Ϊ10
        int[] a = new int[10];
        Random r = new Random();
        //2.����ramdon����������ָ���ÿһ��Ԫ��
        for (int i = 0; i < a.length; i++) {
            int number = r.nextInt(100) + 1;
            a[i] = number;
        }
        System.out.println("�����ڵ�ʮ��ֵΪ:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //3.����forѭ�����
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("�����ܺ�Ϊ:"+sum);
        //4.����һ��double���͵��������ƽ��ֵ
        double avg = sum/a.length;
        System.out.println("ƽ��ֵΪ:"+avg);
        //5.����forѭ����if�ж϶��ٸ�����ƽ����С
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(avg>a[i]){
                count++;
            }
        }
        System.out.println("��"+count+"������ƽ��ֵС");
    }
}
