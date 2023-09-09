package com.qiqi.com.test;

import java.util.HashMap;

public class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int len = grid[i].length;
            for (int j =  0; j < len; j++) {
                if (i==j||len-1-i==j){
                    //对角线元素
                    if (grid[i][j]==0){
                        return false;
                    }
                }else {
                    //非对角线元素
                    if (grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int[] twoSum(int[] nums, int target) {
/*        int[] arr = new int[2];
        loop:for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i==j){
                    continue;
                }
                if (nums[i]+nums[j]==target) {
                    arr[0] = i;
                    arr[1] = j;
                    break loop;
                }
            }
        }
        return arr;*/

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i );
        }
        return new int[0];

    }
}
