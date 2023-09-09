package com.itheima.test;

import com.itheima.util.CodeUtil;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
/*        for (int i = 0; i < 4; i++) {
            int temp = i%4;
            System.out.println(i);
        }*/
/*        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(13)+1;
            System.out.println(index);
        }*/

        CodeUtil codeUtil = new CodeUtil();
//        codeUtil.getLetterCode();
//        codeUtil.getNumberCode();
        String str = codeUtil.getcode();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
