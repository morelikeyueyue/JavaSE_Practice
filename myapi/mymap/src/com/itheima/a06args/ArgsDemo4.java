package com.itheima.a06args;

public class ArgsDemo4 {
    public static void main(String[] args) {

        //可变参数的小细节:
        //1.在方法形参中最多只能写一个可变参数
        //可变参数,理解为一个大胖子,有多少吃多少

        //2.在方法中,如果除了可变参数以外,还有其他的形参,那么可变参数要写在最后面

        //getSum(1,2,3,4,5,6,7,8,9,10);

    }
/*    public static int getSum(int... k,int... v) {
        return 0;
    }

    public static int getSum(int k,int... v) {
        return 0;
    }

    public static int getSum(int... v,int i) {
        return 0;
    }*/
}
