package com.itheima.Arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //��ʽ:
        //��̬��ʼ��:
        //������ʽ
        //��������[] ������ = new ��������[] {Ԫ��1,Ԫ��2,Ԫ��3......};
        //�򻯸�ʽ
        //��������[] ������ = {Ԫ��1,Ԫ��2,Ԫ��3......};
        int[] arr1 = new int[]{11,12,13,14,15};

        String[] arr2 = {"huangqi", "zhangsan", "lisi"};
        double[] arr3 = new double[]{1.93,1.75,1.763,1.83};

        //��չ:
        //����һ�µ�ֵַ�ĸ�ʽ����   [D@14ae5a5
        //[ :��ʾ��ǰ��һ������
        //D :��ʾ��ǰ���������Ԫ�ض���double���͵�
        //@ :��ʾһ���������
        //14ae5a5 :�������������ĵ�ֵַ(ʮ������)
        System.out.println(arr3);
    }
}
