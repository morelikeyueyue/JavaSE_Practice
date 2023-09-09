package com.itheima.test.A05_test;

public class Test {
    public static void main(String[] args) {
        int count = getCount(20);
        System.out.println(count);
    }

    public static int getCount(int step) {
        if (step ==1){
            return 1;
        }
        if (step ==2){
            return 2;
        }
        if (step ==3){
            return 4;
        }
        return getCount(step-1)+getCount(step-2)+getCount(step-3);
    }
}
