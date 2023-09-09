package com.itheima.oop_extend.a01extenddemo5;

public class Manager extends Employee {
    private  int bouns;

    public Manager() {
    }

    public Manager(int bouns) {
        this.bouns = bouns;
    }

    public Manager(String id, String name, int wages, int bouns) {
        super(id, name, wages);
        this.bouns = bouns;
    }


    /**
     * ��ȡ
     * @return ManagementBonus
     */
    public int getBouns() {
        return bouns;
    }

    /**
     * ����
     * @param bouns
     */
    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    public String toString() {
        return "Manager{ManagementBonus = " + bouns + "}";
    }


    //��д����
    @Override
    public void work(){
        System.out.println("�����ڹ�������");
    }
}
