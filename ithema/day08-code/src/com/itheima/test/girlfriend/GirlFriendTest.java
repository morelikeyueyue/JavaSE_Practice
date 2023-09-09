package com.itheima.test.girlfriend;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义一个数组来存储女朋友对象
        GirlFriend[] arr = new GirlFriend[4];

        //2.创建女朋友对象
        GirlFriend gf1= new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2= new GirlFriend("小丹丹",19,"萌妹子","玩游戏");
        GirlFriend gf3= new GirlFriend("小慧慧",20,"萌妹子","看书学习");
        GirlFriend gf4= new GirlFriend("小莉莉",21,"憨妹子","睡觉");

        //3.把对象添加到数组中
        arr[0]=gf1;
        arr[1]=gf2;
        arr[2]=gf3;
        arr[3]=gf4;

        //4.求和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum+=gf.getAge();
        }

        double avg=sum/(double)arr.length;
        System.out.println("平均年龄为:"+avg);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge()<avg){
                count++;
                System.out.printf("%s,%d,%s,%s%n",gf.getName(),gf.getAge(),gf.getGender(),gf.getHobby());
            }
        }

        System.out.println(count);

    }
}
