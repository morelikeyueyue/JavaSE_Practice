package com.itheima.test.roleplay;

import java.util.Random;

public class Role {

    //��׼JavaBean

    private String name;
    private int blood;

    public Role() {

    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return this.blood;
    }

    //����һ���������ڹ�������

    //�����ĵ�����ȥ��������

    public void attack(Role attackedRole) {
        //������ɵ��˺�
        Random r = new Random();
        //ʣ��Ѫ��
        int hurt = r.nextInt(20) + 1;
        int reamaiBlood = attackedRole.blood - hurt;
        reamaiBlood = reamaiBlood<0?0:reamaiBlood;
        attackedRole.blood = reamaiBlood;
        System.out.println(this.getName() + "����ȭͷ����" + attackedRole.getName() + "һ��,�����" + hurt + "���˺�," + attackedRole.getName() + "��ʣ��" + attackedRole.getBlood() + "��Ѫ");
    }

}
