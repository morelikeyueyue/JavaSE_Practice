package com.itheima.oop_interface.Test3;

public class Test {
    public static void main(String[] args) {

        //��������
        BasCoach bc = new BasCoach("�������01",30);
        BasPlayer bp = new BasPlayer("�����˶�Ա01",20);

        PPCoach pc = new PPCoach("ƹ�������01",30);
        PPPlayer pp = new PPPlayer("ƹ�����˶�Ա01",20);

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
