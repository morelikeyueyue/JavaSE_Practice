package com.itheima.test.shopproduct;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //1.����һ���������洢������������
        Phone[] arr = new Phone[3];

        //2.�����ֻ�����
        Phone p1 = new Phone("С��",1995,"��ɫ");
        Phone p2 = new Phone("��Ϊ",2976,"��ɫ");
        Phone p3 = new Phone("ƻ��",3998,"��ɫ");

        //3.���ֻ�������ӵ����鵱��
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4.��ȡ�����ֻ���ƽ���۸�
        double avg=0;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            Phone ph = arr[i];
            sum+=ph.getPrice();
            avg = sum/(double) arr.length;
        }

        System.out.printf("ƽ���۸�Ϊ%.2f",avg);
        System.out.println();

/*        //2.������������,���������ڼ���¼��
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //������������
            com.itheima.test.shopproduct.Car car = new com.itheima.test.shopproduct.Car();
            //¼��Ʒ��
            System.out.println("������������Ʒ��:");
            String brand = sc.next();
            car.setBrand(brand);
            //¼��۸�
            System.out.println("�����������ļ۸�:");
            int price = sc.nextInt();
            car.setPrice(price);
            //¼����ɫ
            System.out.println("��������������ɫ:");
            String color = sc.next();
            car.setColor(color);

            //������������ӵ�������
            arr[i] = car;
        }*/

        //��������
        for (int i = 0; i < arr.length; i++) {
            Phone ph = arr[i];
            System.out.println(ph.getBrand()+","+ph.getPrice()+","+ph.getColor());
        }


    }
}
