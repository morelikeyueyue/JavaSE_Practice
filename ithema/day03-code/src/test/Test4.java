package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*
        ����:����԰��������ֻ�ϻ�,���طֱ�Ӽ���¼����
        ���ó����ж���ֻ�ϻ��������Ƿ���ͬ
         */

        //1.�Ӽ���¼����������
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һֻ�ϻ�������:");
        float tiger1 = sc.nextFloat();
        System.out.println("������ڶ�ֻ�ϻ�������:");
        float tiger2 = sc.nextFloat();

        //2.�Ƚ��Ƿ���ͬ
        boolean result = tiger1 == tiger2;
        System.out.println(result ? "��ͬ" : "����ͬ");
        String result1 = tiger1 == tiger2 ? "��ͬ" : "����ͬ";
        System.out.println(result1);
    }
}
