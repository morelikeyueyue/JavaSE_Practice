package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*����:��һ�������е�Ԫ�ظ��Ƶ���һ���µ�������ȥ
         */
        // 1 2 3 4 5
        // 1 2 3 4 5
        //����:
        //1.����һ��������洢Ԫ��
        int[] oldarr = {1,2,3,4,5};
        //2.����һ�������鳤�ȸ�������һ��
        int[] newarr = new int[oldarr.length];
        //3.����������,�õ�ÿһ��Ԫ�ز��Ҹ�ֵ����������ȥ
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
