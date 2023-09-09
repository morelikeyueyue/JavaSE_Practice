package com.itheima.test;

public class Test2Case2 {
    public static void main(String[] args) {
        /*调整字符串:
        给定两个字符串 A B
        A的旋转操作就是将A的最左边的字符移动到最右边
        如果在若干次调整后A能变成B,则返回true 否则返回false
         */

        //1.定义两个字符串
        String arrA = "abcde";
        String arrB = "cdeab";

        //2.旋转字符串
//        String result=arrA;
//        result = rotate(arrA);
//        System.out.println(result);

        //3.循环strA.length()次
        boolean flag =check(arrA,arrB);
        System.out.println(flag);

    }

    //旋转字符串,把左侧的字符移动到右侧
    public static String rotate(String strA){
        //要修改字符串中的内容
        //1.用substring进行截取,把左侧的截取出来拼接到右边
        //2.可以把字符串转换为字符数组,然后调整字符数组里面的数据,最后再把字符数组转换为字符串

//        "ABC"  ['A','B','C']
//        System.out.println(strA);
        char[] arr = strA.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
//            if (i== arr.length-1){
//                arr[i]=first;
//            }
        }
        arr[arr.length-1]=first;

        String result= new String(arr);
//        System.out.println(result);
        return result;

    }

    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
}
