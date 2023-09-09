package com.itheima.oop_interface.Test3;

public class Test {
    public static void main(String[] args) {

        //创建对象
        BasCoach bc = new BasCoach("篮球教练01",30);
        BasPlayer bp = new BasPlayer("篮球运动员01",20);

        PPCoach pc = new PPCoach("乒乓球教练01",30);
        PPPlayer pp = new PPPlayer("乒乓球运动员01",20);

        System.out.println(bc.getName()+", "+bc.getAge());
        bc.teach();

        System.out.println(bp.getName()+", "+bp.getAge());
        bp.study();

        System.out.println(pc.getName()+", "+pc.getAge());
        pc.teach();
        pc.speakEnglish();

        System.out.println(pp.getName()+", "+pp.getAge());
        pp.study();
        pp.speakEnglish();

    }
}
