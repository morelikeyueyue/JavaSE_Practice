package com.itheima.oop_interface.Test3;

public class PPPlayer extends Player implements SpeakEng{
    public PPPlayer() {
    }

    public PPPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("ƹ�����˶�Աѧ��ƹ����");
    }

    @Override
    public void speakEnglish() {
        System.out.println("ƹ�����˶�Ա˵Ӣ��");
    }
}
