package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //Ŀ��:Ҫ�����ֳ�ʲôʱ��ʹ�ô�����ֵ�ķ���
        double area1 =getArea(8,10);
        double area2 =getArea(10,20);
        compareArea(area1, area2);
    }
    //�󳤷��ε����
    public static double getArea(double len, double row){
        double result = len*row;
        return result;
    }

    //�Ƚϴ�С
    public static void compareArea(double area1,double area2){
        if (area1 > area2){
            System.out.println("��һ���Ƚϴ�");
        }else if(area1 < area2){
            System.out.println("�ڶ����Ƚϴ�");
        }else {
            System.out.println("һ����");
        }
    }
    //�����ͷ���֮����ƽ����ϵ,���ܻ���Ƕ�׶���
    //�����ı�д˳���ִ��˳���޹�
    //����û�з���ֵ,return���Բ�д,д�˲��ܸ����,��ʾ��������
}
