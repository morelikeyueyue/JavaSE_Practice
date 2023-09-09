package com.qiqi.com.test;

public class Test1 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        //int[][] grid = {{2,0,0,1},{0,3,1,0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        int[][] grid = {{5, 7, 0}, {0, 3, 1}, {0, 5, 0}};
        System.out.println(sl.checkXMatrix(grid));
    }
}
