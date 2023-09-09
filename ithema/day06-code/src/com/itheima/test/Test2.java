package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //目标:要能区分出什么时候使用带返回值的方法
        double area1 =getArea(8,10);
        double area2 =getArea(10,20);
        compareArea(area1, area2);
    }
    //求长方形的面积
    public static double getArea(double len, double row){
        double result = len*row;
        return result;
    }

    //比较大小
    public static void compareArea(double area1,double area2){
        if (area1 > area2){
            System.out.println("第一个比较大");
        }else if(area1 < area2){
            System.out.println("第二个比较大");
        }else {
            System.out.println("一样大");
        }
    }
    //方法和方法之间是平级关系,不能互相嵌套定义
    //方法的编写顺序和执行顺序无关
    //方法没有返回值,return可以不写,写了不能跟别的,表示结束方法
}
