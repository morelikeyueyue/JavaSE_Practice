package com.itheima.oop_extend.a01extenddemo3;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用
        Husky h =new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        ChineseGardenDog cd = new ChineseGardenDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

        Sandbark sb =new Sandbark();
        sb.eat();
        sb.drink();
        sb.lookHome();
    }
}
