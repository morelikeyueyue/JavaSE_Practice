package com.itheima.a05myset;


public class Student1{
//public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student1() {
    }

    public Student1(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        int sum = this.getChinese() + this.getMath() + this.getEnglish();
        return "Student1{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english +",总分:"+sum+ "}";
    }


/*    @Override
    public int compareTo(Student1 o) {
        int sum1 = this.getChinese() + this.getMath() + this.getEnglish();
        int sum2 = o.getChinese() + o.getMath() + o.getEnglish();
        int i = sum1 - sum2;
        i=i==0? this.getChinese()-o.getChinese():i;
        i=i==0? this.getMath()-o.getMath():i;
        //i=i==0? this.getEnglish()-o.getEnglish():i;
        i=i==0? this.getAge()-o.getAge():i;
        i=i==0? this.getName().compareTo(o.getName()):i;
        return i;
    }*/
}
