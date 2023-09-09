package com.itheima.a08regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        //qq号码是否正确:6~20位之间 0不能开头 必须全部是数字

        String qq = "12345678901234567890";
        boolean result = checkQQ(qq);
        System.out.println(result);


        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq) {
        //核心思想:先把异常数据进行过滤
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }
        if (qq.charAt(0) == '0') {
            return false;
        }
        for (int i = 1; i < len; i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
