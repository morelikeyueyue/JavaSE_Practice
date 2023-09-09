package com.itheima.a02systemdemo1;

public class SystemDemo3 {
    public static void main(String[] args) {
        //arraycopy(数据源数组,起始索引,目的地数组,起始索引,拷贝个数)  数组拷贝
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int[] arr2 =new int[10];

        // arr2 0 0 0 0 1 2 3 0 0 0
        //        System.arraycopy(arr1, 0, arr2, 4,3 );

        // arr2 0 0 7 8 9 0 0 0 0 0
        //        System.arraycopy(arr1, 6, arr2, 2,3 );
        //把arr1中的数据拷贝到arr2中
        System.arraycopy(arr1, 6, arr2, 2,3 );
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+", ");
        }

    }
}
