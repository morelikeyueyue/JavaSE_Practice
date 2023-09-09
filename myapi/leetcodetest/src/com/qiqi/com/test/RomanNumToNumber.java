package com.qiqi.com.test;

import java.util.HashMap;

public class RomanNumToNumber {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int num = romanToInt(s);
        System.out.println(num);

    }

    public static int romanToInt(String s) {
/*        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int max = 1;
        int sum = 0;
        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i);
            Integer result = hm.get(c);
            if (result>=max){
                sum+=result;
                max = result;
            } else if (result<max) {
                sum-=result;
            }

        }
        return sum;*/
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int min = 1000;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer result = hm.get(c);
            if (result <= min) {
                sum += result;
                min = result;
            } else if (result > min) {
                sum = sum- hm.get(s.charAt(i-1))*2+result;
            }

        }
        return sum;
    }
}
