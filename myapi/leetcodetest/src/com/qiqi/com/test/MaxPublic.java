package com.qiqi.com.test;

import java.util.logging.LoggingPermission;

public class MaxPublic {
    public static void main(String[] args) {

        //String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"flower", "flower", "flower"};
        String maxStr = longestCommonPrefix(strs);
        System.out.println(maxStr);


    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0||strs==null){
            return "";
        }
        //第一个字符串的最大索引
        int end = strs[0].length()-1;
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length()&&j<=end; j++) {
                if (strs[0].charAt(j)!=strs[i].charAt(j)) {
                    break;
                }
            }
            //获取最大公共区域的最大索引
            end = Math.min(end,j-1);
            if (end<0){
                break;
            }

        }

        //包头不包尾,所以end+1
        return strs[0].substring(0,end+1);
    }
}
