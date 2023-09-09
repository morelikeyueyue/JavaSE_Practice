package com.itheima.twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        /*需求:
           二维数组:
           静态初始化
            数据类型[][] 数组名 = new 数据类型[][]{{元素}{元素}};
            简写:数据类型[][] 数组名 = {{元素},{元素}};
         */
        //1.二维数组静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{1,2,3}};
        //把每个一维数组另写一行
        //最后一个一维数组不用写逗号
        int[][] arr2 = {
                {1,2,3,4,5,6},
                {1,2,3,4,5,9}
        };

        //2.获取元素
        System.out.println(arr2[0]); //表示获取二维数组中的第一个一维数组
        System.out.println(arr2[0][0]);//获取第一个一维数组中的索引元素

        //3.遍历二维数组
        //外循环:遍历二维数组,得到里面每一个一位数组
        //内循环:遍历一位数组中的每一个元素
        for (int i = 0; i < arr2.length; i++) {
            //i表示二维数组中的每一个索引
            for (int j = 0; j < arr2[i].length; j++) {
                //j表示一位数组中的每一个元素
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
