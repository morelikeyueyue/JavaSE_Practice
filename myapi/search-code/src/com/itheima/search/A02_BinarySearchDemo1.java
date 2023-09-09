package com.itheima.search;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 131;
        int index = binarySearch(number, arr);
        if (index<0){
            System.out.println("不存在");
        }else {
            System.out.println("存在,索引为"+index);
        }
    }

    private static int binarySearch(int number, int[] arr) {
        int max = arr.length-1;
        int min = 0;
        while (true) {
            if (min>max){
                System.out.println("不存在数字");
                return -1;
            }
            int mid = (max+min)/2;
            if (number == arr[mid]){
                return mid;
            } else if (number<arr[mid]) {
                max= mid-1;
//                System.out.println("max="+max);
            }else{
                min = mid+1;
//                System.out.println("min"+min);
            }
//            System.out.println(max==min);
        }

    }


}
