package com.itheima.oop_extend.a01extenddemo2;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}


class Fu {
    String name = "Fu";
    String hobby = "�Ȳ�";
}

class Zi extends Fu {
    String name = "Zi";
    String game = "�Լ�";

    public void show(){
        //��δ�ӡZi
        System.out.println(name);
        System.out.println(this.name);
        //��δ�ӡFu
        System.out.println(super.name);
        //��δ�ӡ�Ȳ�
        System.out.println(hobby);
        System.out.println(super.hobby);
        //��δ�ӡ�Լ�
        System.out.println(game);
        System.out.println(this.game);

    }
}