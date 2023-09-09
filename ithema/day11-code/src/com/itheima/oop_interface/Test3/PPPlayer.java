package com.itheima.oop_interface.Test3;

public class PPPlayer extends Player implements SpeakEng{
    public PPPlayer() {
    }

    public PPPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
