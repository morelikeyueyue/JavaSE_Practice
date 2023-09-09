package com.itheima.oop_extend.a01extenddemo5;

public class Employee {
    private String id;
    private String name;
    private int wages;

    public Employee() {
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.wages = salary;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return wages
     */
    public int getWages() {
        return wages;
    }

    /**
     * 设置
     * @param wages
     */
    public void setWages(int wages) {
        this.wages = wages;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", wages = " + wages + "}";
    }

    //工作
    public void work() {
        System.out.println("员工在工作");
    }

    //吃饭
    public void eat() {
        System.out.println("吃米饭");
    }
}
