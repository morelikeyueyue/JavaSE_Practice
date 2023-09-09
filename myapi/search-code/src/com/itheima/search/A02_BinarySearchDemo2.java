package com.itheima.search;

public class A02_BinarySearchDemo2 {
    public static void main(String[] args) {
        //插值查找
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11};
        int number = 4;
        int index = insertSearch(number, arr);
        System.out.println(index);
    }

    private static int insertSearch(int number, int[] arr) {
        int max = arr.length-1;
        int min = 0;
        int count = 0;
        while (true) {
            int mid = (int)(min +(number-(double)arr[min])/(arr[max]-arr[min])*(max-min));
            if (min>max){
                System.out.println("不存在");
                System.out.println(count);
                return -1;
            }
            if(number<arr[mid]){
                count++;
                max = mid-1;
            }else if (number>arr[mid]){
                count++;
                min = mid+1;
            }else {
                System.out.println(count);
                return mid;
            }
        }
    }
}
