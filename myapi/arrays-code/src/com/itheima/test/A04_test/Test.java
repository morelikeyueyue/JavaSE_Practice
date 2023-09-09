package com.itheima.test.A04_test;

public class Test {
    public static void main(String[] args) {

        int count = getCount(20);
        System.out.println(count);
    }

    public static int getCount(int step){
        if (step == 1){
            return 1;
        }
        if (step == 2){
            return 2;
        }
        return getCount(step-1)+getCount(step-2);
    }
}
