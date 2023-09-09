package com.itheima.test.roleplayupgrade;

public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role("ÇÇ·å",100,'ÄÐ');
        Role role2 = new Role("ð¯Ä¦ÖÇ",100,'Å®');

        role1.showRoleInfo();
        role2.showRoleInfo();

        while(true){
            //role1¹¥»÷role2
            role1.attack(role2);
            if (role2.getBlood()==0){
                System.out.println(role1.getName()+"K.OÁË"+role2.getName());
                break;
            }

//            role2¹¥»÷role1
            role2.attack(role1);
            if (role1.getBlood()==0){
                System.out.println(role2.getName()+"K.OÁË"+role1.getName());
                break;
            }
        }
    }
}
