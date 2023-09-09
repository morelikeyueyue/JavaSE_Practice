package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //1.从键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入约会对象的时髦度");
        int girlFashion = sc.nextInt();

        //2.比较大小
        boolean result = myFashion>girlFashion;
        System.out.println(result);
    }
}
