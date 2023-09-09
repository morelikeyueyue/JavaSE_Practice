package com.itheima.test.roleplayupgrade;

import java.util.Random;

public class Role {

    //��׼JavaBean

    private String name;
    private int blood;
    private char gender;
    private String face;


    String[] boyfaces= {"��������","��������","��òӢ��","��ٶ���","��òƽƽ","һ����Ϳ","��Ŀ����"};
    String[] girlfaces ={"��ۼ����","��������","��������","��Ľ���","��òƽƽ","��ò��ª","�Ҳ��̶�"};

//    attack ����������
    String[] attacks_desc={
            "%sʹ����һ�С����Ķ�����ת���Է������һ����%s���ĵ���̨Ѩ��ȥ��",
            "%sʹ����һ�С��ο�̽צ�������������԰���б���Ϊץ����%s��",
            "%s���һ���������·���һ�С�����׹�ء�������%s˫�ȡ�",
            "%s�������ƣ�һ˲�����ı��Ѫ�죬һʽ�������ס�������%s��",
            "%s���ַ������ָ�����һ�С�û�����������ʵʵ�Ĵ���%s��",
            "%s�ϲ������������У�һ�С���������������������%s��"
    };

//    injured ����������
    String[] injureds_desc={
            "���%s���˰벽����������",
            "�����%s���һ������",
            "���һ�����У�%sʹ��������",
            "���%sʹ����ƺ���һ������Ȼ���˵�����",
            "���%sҡҡ�λΣ�һ��ˤ���ڵ�",
            "���%s��ɫһ�±�òҰף������˺ü���",
            "������䡻��һ����%s������Ѫ�������",
            "���%sһ���ҽУ���̲�����������ȥ"
    };

    public Role() {

    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        //�����������
        if(gender=='��'){
            //��boyfaces���
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender=='Ů'){
            //��girlfaces���
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "��Ŀ����";
        }

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


    //չʾ������Ϣ
    public void showRoleInfo() {
        System.out.println("����Ϊ:"+getName());
        System.out.println("Ѫ��Ϊ:"+getBlood());
        System.out.println("�Ա�Ϊ:"+getGender());
        System.out.println("��òΪ:"+getFace());

    }


    //�����ĵ�����ȥ��������

    public void attack(Role attackedRole) {

        //���һ��������Ч��
        Random r = new Random();
        int attackIndex =  r.nextInt(attacks_desc.length);
        String KongFu = attacks_desc[attackIndex];
        System.out.printf(KongFu,this.getName(),attackedRole.getName());
        System.out.println();

        //������ɵ��˺�

        //ʣ��Ѫ��
        int hurt = r.nextInt(20) + 1;
        int reamaiBlood = attackedRole.blood - hurt;
        reamaiBlood = reamaiBlood<0?0:reamaiBlood;
        attackedRole.blood = reamaiBlood;

        //���˵�����
        //���ʣ��Ѫ������90 0����
        //80~90  1
        //70~80 2
        //60~70 3
        //40~60 4
        //20~40 5
        //10~20 6
        //<10   7
        int flag = reamaiBlood >=90?0:
                    reamaiBlood >=80&&reamaiBlood<90?1:
                    reamaiBlood >=70&&reamaiBlood<80?2:
                    reamaiBlood >=60&&reamaiBlood<70?3:
                    reamaiBlood >=40&&reamaiBlood<60?4:
                    reamaiBlood >=20&&reamaiBlood<40?5:
                    reamaiBlood >=10&&reamaiBlood<20?6:
                    reamaiBlood <10?7:100;

        switch(flag){
            case 0:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
            case 1:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
            case 2:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
            case 3:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
            case 4:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
            case 5:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
            case 6:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
            case 7:
                System.out.printf(injureds_desc[flag],attackedRole.getName());
        }
        System.out.println();

    }

}
