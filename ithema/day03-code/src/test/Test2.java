package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //1.�Ӽ���¼����������
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ҵ�ʱ�ֶ�");
        int myFashion = sc.nextInt();
        System.out.println("������Լ������ʱ�ֶ�");
        int girlFashion = sc.nextInt();

        //2.�Ƚϴ�С
        boolean result = myFashion>girlFashion;
        System.out.println(result);
    }
}
