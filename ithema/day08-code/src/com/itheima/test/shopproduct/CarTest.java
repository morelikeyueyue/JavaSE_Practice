package com.itheima.test.shopproduct;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1.����һ���������洢������������
        Car[] arr = new Car[3];


        //2.������������,���������ڼ���¼��
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //������������
            Car car = new Car();
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
        }

        //��������
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }

    }
}
