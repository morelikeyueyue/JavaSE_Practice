package ccom.itheima.a01staticdemo1;

public class Student {
    //����:���� ���� �Ա�
    //����:��ʦ������
    private String name;
    private int age;
    private String gender;

    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //��Ϊ:
    public void study(){
        System.out.println(name+"����ѧϰ");
    }

    public void show(){
        System.out.println(name+", "+age+", "+gender+", "+teacherName);
    }
}
