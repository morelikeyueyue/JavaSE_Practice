package com.itheima.Arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //格式:
        //静态初始化:
        //完整格式
        //数据类型[] 数组名 = new 数据类型[] {元素1,元素2,元素3......};
        //简化格式
        //数据类型[] 数组名 = {元素1,元素2,元素3......};
        int[] arr1 = new int[]{11,12,13,14,15};

        String[] arr2 = {"huangqi", "zhangsan", "lisi"};
        double[] arr3 = new double[]{1.93,1.75,1.763,1.83};

        //扩展:
        //解释一下地址值的格式含义   [D@14ae5a5
        //[ :表示当前是一个数组
        //D :表示当前数组里面的元素都是double类型的
        //@ :表示一个间隔符号
        //14ae5a5 :这是数组真正的地址值(十六进制)
        System.out.println(arr3);
    }
}
