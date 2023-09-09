package com.itheima.oop_extend.a01extenddemo6;

public class Employee {
    private String id;
    private String name;
    private String work;


    public Employee() {
    }

    public Employee(String id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
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
     * @return work
     */
    public String getWork() {
        return work;
    }

    /**
     * ����
     * @param work
     */
    public void setWork(String work) {
        this.work = work;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", work = " + work + "}";
    }

    //����
    public void work(){
        System.out.println("Ա���ڹ���");
    }
}
