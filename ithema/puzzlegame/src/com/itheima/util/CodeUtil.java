package com.itheima.util;

import java.util.Random;

public class CodeUtil {

    //得到五位验证码
    public static String getcode(){
        //得到四位字母
        char[] arr = new char[5];
        for (int i = 0; i < 4; i++) {
            char c = getLetterCode();
            arr[i]=c;
        }
        //得到一位数字
        char number = getNumberCode();
        arr[4] = number;

        //打乱验证码
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String str = new String(arr);
        return str;


    }

    //得到字母
    private static char getLetterCode(){
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i>=0&&i<26){
                arr[i] = (char)(i+'a');
            } else if (i>25&&i<52) {
                arr[i] = (char)(i+'A'-26);
            }
        }
/*        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }*/
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];
    }

    //得到数字
    private static char getNumberCode(){
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(i+'0');
        }
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];


/*        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }*/

    }
}
