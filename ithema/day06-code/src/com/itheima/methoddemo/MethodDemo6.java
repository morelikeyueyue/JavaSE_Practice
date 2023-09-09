package com.itheima.methoddemo;

public class MethodDemo6 {
    public static void main(String[] args) {
        //方法调用后会进栈 栈内存  new和数组存储内容在堆内存

        int number = 100;
        System.out.println("调用change方法前:"+number);
        change(number);
        System.out.println("调用change方法后:"+number);
        int[] arr ={1,20,30};
        change(arr);
        System.out.println(arr[1]);
        //传递基本


    }
    public static void change(int number){
        number = 200;
    };
    public static void change(int[] arr){
        arr[1] = 200;
    }
}
