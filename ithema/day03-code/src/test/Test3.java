package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //1.从键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();

        //2.判断和是否为6
        boolean result = (num1==6||num2==6)||((num1+num2)%6==0);
        System.out.println(result);
    }
}
