package com.itheima.oop_interface.Test3;

public class PPCoach extends Coach  implements SpeakEng{
    public PPCoach() {
    }

    public PPCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("∆π≈“«ÚΩÃ¡∑ΩÃ∆π≈“«Ú");
    }

    @Override
    public void speakEnglish() {
        System.out.println("∆π≈“«ÚΩÃ¡∑Àµ”¢”Ô");
    }
}
