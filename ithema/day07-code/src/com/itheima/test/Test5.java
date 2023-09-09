package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*需求:把一个数组中的元素复制到另一个新的数组中去
         */
        // 1 2 3 4 5
        // 1 2 3 4 5
        //分析:
        //1.定义一个老数组存储元素
        int[] oldarr = {1,2,3,4,5};
        //2.定义一个新数组长度跟老数组一致
        int[] newarr = new int[oldarr.length];
        //3.遍历老数组,得到每一个元素并且赋值给新数组中去
        for (int i = 0; i < oldarr.length; i++) {
            System.out.print(oldarr[i]);
        }
        System.out.println();
        newarr = copyInts(oldarr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]);
        }
    }
    public static int[] copyInts(int[] oldarr) {
        int[] newarr = new int[oldarr.length];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = oldarr[i];
        }
        return newarr;
    }
}
