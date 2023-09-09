package com.qiqi.com.test;

public class Palindrome {
    public static void main(String[] args) {
        int x = 1;
        boolean flag = isPalindrome(x);
        boolean flag1 = isPalindrome1(x);
        //System.out.println(flag);
        System.out.println(flag1);
    }

    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            char c = (char)(x%10+'0');
            sb.append(c);
            x = x / 10;
            if (x == 0){
                break;
            }
        }
        if (sb.length()==0||(sb.charAt(0) == '0'&&sb.length()>1)){
            return false;
        }
        String numStr1 = sb.toString();
        String numStr2 = sb.reverse().toString();

        return numStr1.equals(numStr2);
    }

    public static boolean isPalindrome1(int x){
        //反转一半数字
/*        if(x<0||x%10==0&&x!=0){
            return false;
        }
        int num = x;
        int reverseNum = 0;
        while (x!=0){
            reverseNum = reverseNum*10+x%10;
            x=x/10;
        }
        System.out.println(reverseNum);
        System.out.println(num);
        if(reverseNum==num){
            return true;
        }else {
            return false;
        }*/


        //反转一半
        if(x<0||x%10==0&&x!=0){
            return false;
        }
        int reverseNum = 0;
        //当x =< reverse 跳出循环
        while (x>reverseNum){
            reverseNum = reverseNum*10+x%10;
            x=x/10;
        }
        //如果x是奇数个数字 则reverseNum多一位,需要除以10
        //如果是偶数个数字 reverseNum和x一样的位数
        return reverseNum==x||reverseNum/10==x;
    }

}
