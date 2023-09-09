package com.itheima.search;

import java.util.Arrays;

public class A04_FeiBoSearchDemo1 {
    public static int maxSize =20;
    public static void main(String[] args) {
        //斐波那契查找
        int[] arr = {1, 8, 10, 89, 1000, 1234};
        int number = 1234;
        int index = search(number, arr);
        System.out.println(index);
    }

    //获得一个斐波那契数列
    public static int[] getFeiBo() {
        int[] arr = new int[maxSize];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        // 1 1 2 3 5 8 13 21
        return arr;
    }
    private static int search(int key, int[] arr) {
        int max = arr.length - 1;
        int min = 0;
        //表示斐波那契数分割数的下标值
        int index = 0;
        int mid =0;
        //调用斐波那契数列
        int[] f = getFeiBo();
        //获取斐波那契分割数值的下标
        while (max > (f[index] - 1)) {
            index++;
        }
        //因为f[k]值可能大于a的长度，因此需要使用Arrays工具类，构造一个新法数组，并指向temp[],不足的部分会使用0补齐
        int[] temp = Arrays.copyOf(arr, f[index]);
        //实际需要使用arr数组的最后一个数来填充不足的部分
        for (int i = max + 1; i < temp.length; i++) {
            temp[i] = arr[max];
        }
        //使用while循环处理，找到key值
        while (min <= max) {
            mid = min + f[index - 1] - 1;
            if (key < temp[mid]) {//向数组的前面部分进行查找
                max = mid - 1;
                /*
                  对k--进行理解
                  1.全部元素=前面的元素+后面的元素
                  2.f[k]=k[k-1]+f[k-2]
                  因为前面有k-1个元素没所以可以继续分为f[k-1]=f[k-2]+f[k-3]
                  即在f[k-1]的前面继续查找k--
                  即下次循环,mid=f[k-1-1]-1
                 */
                index--;
            } else if (key > temp[mid]) {//向数组的后面的部分进行查找
                min = mid + 1;
                index -= 2;
            } else {//找到了
                //需要确定返回的是哪个下标
                if (mid <= max) {
                    return mid;
                } else {
                    return max;
                }
            }
        }
        return -1;
    }
}
