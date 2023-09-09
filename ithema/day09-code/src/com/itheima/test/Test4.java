package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*生成验证码  长度为5
        长度为5 可以是大小写和数字 但是数字只能有一位
         */
        //1.定义一个字符数组来存储随机得到的字符
        char[] arr = new char[5];

        //2.得到随机的字母
        char charLetter;
        for (int i = 0; i < 4; i++) {
            charLetter = getChar();
            arr[i] = charLetter;
        }


        //3.得到随机的数字
        char charNumber = getInt();
        arr[4]= charNumber;


        //4.打乱字符数组
        char[] result = changechaos(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        //5.打印字符串
        String str = new String(result);
//        System.out.println(str);

    }
    //得到随机字母
    public static char getChar() {
/*        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y',
                'z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];*/

        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<26){
                arr[i] = (char)('a'+i);
//                System.out.print(arr[i]);
            }else if (i>=26) {
                arr[i] = (char)(i-26+'A');
//                System.out.print(arr[i]);
            }
        }
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];
    }


    //得到数字
    public static char getInt(){
//        char[] arr ={'0','1','2','3','4','5','6','7','8','9'};
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(char)('0'+i);
//            System.out.print(arr[i]);
        }
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];
    }

    //打乱字符数组
    public static char[] changechaos(char[] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
