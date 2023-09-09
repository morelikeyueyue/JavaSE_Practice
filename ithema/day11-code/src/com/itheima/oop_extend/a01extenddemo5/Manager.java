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
     * 获取
     * @return ManagementBonus
     */
    public int getBouns() {
        return bouns;
    }

    /**
     * 设置
     * @param bouns
     */
    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    public String toString() {
        return "Manager{ManagementBonus = " + bouns + "}";
    }


    //重写工作
    @Override
    public void work(){
        System.out.println("经理在管理他人");
    }
}
