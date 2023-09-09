package com.itheima.oop_extend.a01extenddemo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //1.创建布偶猫对象
        Ragdoll rd = new Ragdoll();
        //间接父类
        rd.eat();
        rd.drink();
        //直接父类
        rd.catchMouse();
        System.out.println();

        //2.创建中国狸花猫对象
        LiHua lh = new LiHua();

        lh.eat();
        lh.drink();

        lh.catchMouse();
        System.out.println();

        //3.创建哈士奇对象
        Husky h = new Husky();
        h.eat();
        h.drink();

        h.lookHome();

        h.breakHome();
        System.out.println();

        //3.创建泰迪对象
        Teddy t = new Teddy();
        t.eat();
        t.drink();

        t.lookHome();

        t.touch();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

    }
}
