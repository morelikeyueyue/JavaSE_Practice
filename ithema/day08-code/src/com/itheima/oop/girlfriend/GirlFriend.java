package com.itheima.oop.girlfriend;

public class GirlFriend {
    //����

    // private ���η� ֻ���ڱ����в��ܷ���
    // �������γ�Ա(��Ա�����ͳ�Ա����)

    // ��Ա���� �����ڷ�������
    // �ֲ����� �����ڷ�������

    // �ͽ�ԭ�� ˭����˭
    // this�ؼ���

    private String name;
    private int age;
    private String gender;

    //��Ϊ
    //set ��ֵ

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if (age>=18&&age<=50){
            this.age =age;
        }else {
            System.out.println("�Ƿ�����");
        }
    }

    public void setGender(String gender){
        if (gender.equals("��")||gender.equals("Ů")){
            this.gender =gender;
        }else {
            System.out.println("�Ƿ�����");
        }
    }

    //get ��ȡ
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }



    public void sleep(){
        System.out.println("Ů������˯��");
    }

    public void eat(){
        System.out.println("Ů�����ڳԷ�");
    }
}
