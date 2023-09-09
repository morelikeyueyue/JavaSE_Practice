package com.itheima.test.roleplay;

import java.util.Random;

public class Role {

    //标准JavaBean

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

    //定义一个方法用于攻击别人

    //方法的调用者去攻击参数

    public void attack(Role attackedRole) {
        //计算造成的伤害
        Random r = new Random();
        //剩余血量
        int hurt = r.nextInt(20) + 1;
        int reamaiBlood = attackedRole.blood - hurt;
        reamaiBlood = reamaiBlood<0?0:reamaiBlood;
        attackedRole.blood = reamaiBlood;
        System.out.println(this.getName() + "举起拳头打了" + attackedRole.getName() + "一下,造成了" + hurt + "点伤害," + attackedRole.getName() + "还剩下" + attackedRole.getBlood() + "点血");
    }

}
