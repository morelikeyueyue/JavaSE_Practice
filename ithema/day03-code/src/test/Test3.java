package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //1.�Ӽ���¼����������
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������:");
        int num1 = sc.nextInt();
        System.out.println("������ڶ�������:");
        int num2 = sc.nextInt();

        //2.�жϺ��Ƿ�Ϊ6
        boolean result = (num1==6||num2==6)||((num1+num2)%6==0);
        System.out.println(result);
    }
}
