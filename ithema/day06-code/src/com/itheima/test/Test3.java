package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //����:���һ�������û�����ı���,Ҫ������Ľ������һ���ϵ�
        int[] arr = {1,2,3,4,5,6,7,8};
        printArray(arr);

//        System.out.println("abc"); �ȴ�ӡabc�ٻ���
//        System.out.print("abc"); ֻ��ӡabc ������
//        System.out.println(); ����ӡ�κ�����,ֻ�����д���
    }
    //����ı���
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("["+arr[i]+",");
            }else if (i>0&&i<arr.length-1){
                System.out.print(arr[i]+",");
            }else{
                System.out.print(arr[i]+"]");
            }
        }
        System.out.println();
    }
}
