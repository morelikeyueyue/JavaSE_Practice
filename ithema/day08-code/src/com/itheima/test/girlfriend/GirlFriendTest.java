package com.itheima.test.girlfriend;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.����һ���������洢Ů���Ѷ���
        GirlFriend[] arr = new GirlFriend[4];

        //2.����Ů���Ѷ���
        GirlFriend gf1= new GirlFriend("Сʫʫ",18,"������","����ʳ");
        GirlFriend gf2= new GirlFriend("С����",19,"������","����Ϸ");
        GirlFriend gf3= new GirlFriend("С�ۻ�",20,"������","����ѧϰ");
        GirlFriend gf4= new GirlFriend("С����",21,"������","˯��");

        //3.�Ѷ�����ӵ�������
        arr[0]=gf1;
        arr[1]=gf2;
        arr[2]=gf3;
        arr[3]=gf4;

        //4.���
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum+=gf.getAge();
        }

        double avg=sum/(double)arr.length;
        System.out.println("ƽ������Ϊ:"+avg);
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
