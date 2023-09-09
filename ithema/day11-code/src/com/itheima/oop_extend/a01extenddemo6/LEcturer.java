package com.itheima.oop_extend.a01extenddemo6;

public class LEcturer extends Teacher{
    public LEcturer() {
    }

    public LEcturer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work(){
        System.out.println("½²Ê¦ÔÚ½²¿Î");
    }
}
