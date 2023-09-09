package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数,获取其中的个位十位百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();
        int ge = number%10;
        int shi = number/10%10;
        int bai = number/10/10%10;
        System.out.println("个位:"+ge+"十位:"+shi+"百位:"+bai);
    }
}
