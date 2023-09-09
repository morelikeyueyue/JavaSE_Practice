package com.itheima.test.shopproduct;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个数组来存储三个汽车对象
        Phone[] arr = new Phone[3];

        //2.创建手机对象
        Phone p1 = new Phone("小米",1995,"黄色");
        Phone p2 = new Phone("华为",2976,"白色");
        Phone p3 = new Phone("苹果",3998,"紫色");

        //3.把手机对象添加到数组当中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4.获取三部手机的平均价格
        double avg=0;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            Phone ph = arr[i];
            sum+=ph.getPrice();
            avg = sum/(double) arr.length;
        }

        System.out.printf("平均价格为%.2f",avg);
        System.out.println();

/*        //2.创建汽车对象,数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            com.itheima.test.shopproduct.Car car = new com.itheima.test.shopproduct.Car();
            //录入品牌
            System.out.println("请输入汽车的品牌:");
            String brand = sc.next();
            car.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车的价格:");
            int price = sc.nextInt();
            car.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车的颜色:");
            String color = sc.next();
            car.setColor(color);

            //把汽车对象添加到数组中
            arr[i] = car;
        }*/

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Phone ph = arr[i];
            System.out.println(ph.getBrand()+","+ph.getPrice()+","+ph.getColor());
        }


    }
}
