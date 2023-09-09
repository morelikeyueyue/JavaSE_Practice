package com.itheima.a08test;




public class Test5 {
    public static void main(String[] args) {
        isNarcissistic(1634);
        //System.out.println(Math.pow(2, 3));

    }
    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        int num = number;
        int flag = 0;
        while (num!=0) {
            int i = num%10;
            num = num/10;
            flag++;
        }
        num = number;
        int sum = 0;
        for (int i = 0; i < flag; i++) {
            int n = num%10;
            num = num/10;
            sum+=Math.pow(n,flag);
        }
        if (sum == number){
            return true;
        }else {
            return false;
        }
    }
}
