package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求:动物园里面有两只老虎,体重分别从键盘录入获得
        请用程序判断两只老虎的体重是否相同
         */

        //1.从键盘录入两个体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重:");
        float tiger1 = sc.nextFloat();
        System.out.println("请输入第二只老虎的体重:");
        float tiger2 = sc.nextFloat();

        //2.比较是否相同
        boolean result = tiger1 == tiger2;
        System.out.println(result ? "相同" : "不相同");
        String result1 = tiger1 == tiger2 ? "相同" : "不相同";
        System.out.println(result1);
    }
}
