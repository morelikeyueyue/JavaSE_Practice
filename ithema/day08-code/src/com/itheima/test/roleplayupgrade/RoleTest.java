package com.itheima.test.roleplayupgrade;

public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role("�Ƿ�",100,'��');
        Role role2 = new Role("�Ħ��",100,'Ů');

        role1.showRoleInfo();
        role2.showRoleInfo();

        while(true){
            //role1����role2
            role1.attack(role2);
            if (role2.getBlood()==0){
                System.out.println(role1.getName()+"K.O��"+role2.getName());
                break;
            }

//            role2����role1
            role2.attack(role1);
            if (role1.getBlood()==0){
                System.out.println(role2.getName()+"K.O��"+role1.getName());
                break;
            }
        }
    }
}
