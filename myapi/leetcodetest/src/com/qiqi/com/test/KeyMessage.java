package com.qiqi.com.test;

import java.util.HashMap;
import java.util.StringJoiner;

public class KeyMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String s = decodeMessage(key, message);
        String s1 = decodeMessage1(key, message);
        System.out.println(s);
        System.out.println(s1);

    }

    public static String decodeMessage(String key, String message) {
        //map集合用于存放key中的字符和其对应的字母
        HashMap<Character, Character> hm = new HashMap<>();
        char c = 'a';
        //遍历key得到钥匙
        for (int i = 0; i < key.length(); i++) {
            char k = key.charAt(i);
            if (k==' '){
                continue;
            }
            if (hm.containsKey(k)) {
                //已经存在,不进行操作
                continue;
            } else {
                //不存在,添加进去
                hm.put(k, c);
                c = (char) (c + 1);
            }
        }
/*        for (Character character : hm.keySet()) {
            System.out.print(hm.get(character));
        }*/
        //遍历message 解密并进行拼接
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char word = message.charAt(i);
            if (word == ' ') {
                sb.append(word);
            } else {
                sb.append(hm.get(word));
            }
        }
        return sb.toString();
    }

    public static String decodeMessage1(String key, String message){
        //利用数组映射
        char[] arr = new char[26];
        char currChar = 'a';
        //遍历key 将得到的秘钥依次填入arr数组
        for (char c : key.toCharArray()) {
            if (c != ' ' && arr[c-'a']==0 ) {
                //不是空格,并且没有添加过
                arr[c-'a'] = currChar++;
            }
        }
        //遍历message解密
        char[] res = message.toCharArray();
        for (int i = 0; i < res.length; i++) {
            if (res[i]!=' '){
                res[i] = arr[res[i]-'a'];
            }
        }
        return new String(res);
    }
}
