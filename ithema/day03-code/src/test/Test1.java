package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //����¼��һ����λ��,��ȡ���еĸ�λʮλ��λ
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����λ��:");
        int number = sc.nextInt();
        int ge = number%10;
        int shi = number/10%10;
        int bai = number/10/10%10;
        System.out.println("��λ:"+ge+"ʮλ:"+shi+"��λ:"+bai);
    }
}
