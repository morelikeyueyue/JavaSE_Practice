package com.itheima.test.roleplayupgrade;

import java.util.Random;

public class Role {

    //标准JavaBean

    private String name;
    private int blood;
    private char gender;
    private String face;


    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

//    attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

//    injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
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
        //长相是随机的
        if(gender=='男'){
            //从boyfaces随机
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender=='女'){
            //从girlfaces随机
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "面目狰狞";
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

    //定义一个方法用于攻击别人


    //展示对象信息
    public void showRoleInfo() {
        System.out.println("姓名为:"+getName());
        System.out.println("血量为:"+getBlood());
        System.out.println("性别为:"+getGender());
        System.out.println("外貌为:"+getFace());

    }


    //方法的调用者去攻击参数

    public void attack(Role attackedRole) {

        //输出一个攻击的效果
        Random r = new Random();
        int attackIndex =  r.nextInt(attacks_desc.length);
        String KongFu = attacks_desc[attackIndex];
        System.out.printf(KongFu,this.getName(),attackedRole.getName());
        System.out.println();

        //计算造成的伤害

        //剩余血量
        int hurt = r.nextInt(20) + 1;
        int reamaiBlood = attackedRole.blood - hurt;
        reamaiBlood = reamaiBlood<0?0:reamaiBlood;
        attackedRole.blood = reamaiBlood;

        //受伤的描述
        //如果剩余血量大于90 0索引
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
