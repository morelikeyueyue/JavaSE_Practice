package com.itheima.twodimensionarr;

public class TwoDimensionDemo2 {
    /*
    二维数组的动态初始化:
        数据类型[][] 数组名 = new 数据类型[m][n];
        m表示这个二维数组,可以存放多少个一位数组
        n表示每一个一维数组,可以存放多少个元素
     */

    public static void main(String[] args) {
        //1.利用动态初始化格式创建二维数组
        int[][] arr = new int[3][5];
        arr[0][0] = 10;

        //2.遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr1 = new int[2][2];
        int[] a1 = {11, 22};
        int[] a2 = {44, 55, 66};
        arr1[0] = a1;
        arr1[1] = a2;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }


}
