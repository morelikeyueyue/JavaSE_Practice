package com.itheima.Arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //���������������е�Ԫ�ؽ��з���
        //1.��ȡ���������Ԫ��
        //��ʽ:   ������[����]

        int[] arr1 = {1,2,3,4,5};
        int number = arr1[0];
        System.out.println(number);
        //��ȡ������1�����϶�Ӧ�����ݲ��Ҵ�ӡ����
        System.out.println(arr1[1]);

        //2.�����ݴ洢�����鵱��
        //��ʽ  ������[����] = ��������/����;
        //һ������,֮ǰ�����ݾͻ᲻��

        arr1[0] = 100;
        System.out.println(arr1[0]);
    }
}
