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
     * ��ȡ
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * ����
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return wages
     */
    public int getWages() {
        return wages;
    }

    /**
     * ����
     * @param wages
     */
    public void setWages(int wages) {
        this.wages = wages;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", wages = " + wages + "}";
    }

    //����
    public void work() {
        System.out.println("Ա���ڹ���");
    }

    //�Է�
    public void eat() {
        System.out.println("���׷�");
    }
}
