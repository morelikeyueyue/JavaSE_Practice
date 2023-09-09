package com.itheima.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CodeUtil {
    public static String getCode(){
        //1.创建一个集合
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++){
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        //System.out.println(list);
        String result = "";
        //生成四个随机字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(list.size());
            char c = list.get(randomIndex);
            result+=c;
        }
        //System.out.println(result);
        //得到一位数字
        int number = r.nextInt(10);
        result +=number;
        System.out.println(result);
        char[] chars = result.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = r.nextInt(result.length());
            char temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
        }
        String code = new String(chars);
        //System.out.println(code);

        return code;
    }
}
