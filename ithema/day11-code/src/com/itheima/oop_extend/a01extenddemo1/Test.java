package com.itheima.oop_extend.a01extenddemo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //�������󲢵��÷���

        //1.������żè����
        Ragdoll rd = new Ragdoll();
        //��Ӹ���
        rd.eat();
        rd.drink();
        //ֱ�Ӹ���
        rd.catchMouse();
        System.out.println();

        //2.�����й��껨è����
        LiHua lh = new LiHua();

        lh.eat();
        lh.drink();

        lh.catchMouse();
        System.out.println();

        //3.������ʿ�����
        Husky h = new Husky();
        h.eat();
        h.drink();

        h.lookHome();

        h.breakHome();
        System.out.println();

        //3.����̩�϶���
        Teddy t = new Teddy();
        t.eat();
        t.drink();

        t.lookHome();

        t.touch();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

    }
}
