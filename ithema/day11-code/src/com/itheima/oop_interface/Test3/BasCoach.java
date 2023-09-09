package com.itheima.oop_interface.Test3;

public class BasCoach extends Coach{
    public BasCoach() {
    }

    public BasCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("¿∫«ÚΩÃ¡∑ΩÃ¥Ú¿∫«Ú");
    }
}
