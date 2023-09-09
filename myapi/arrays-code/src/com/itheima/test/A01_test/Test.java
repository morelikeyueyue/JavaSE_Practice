package com.itheima.test.A01_test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        //1.创建三个女朋友对象
        GirlFriend gf1 = new GirlFriend("xiaoshishi",18,1.67);
        GirlFriend gf2 = new GirlFriend("xiaodandan",19,1.72);
        GirlFriend gf3 = new GirlFriend("xiaohuihui",19,1.79);
        GirlFriend gf4 = new GirlFriend("abc",19,1.79);

        //2.定义数组存储女朋友的信息
        GirlFriend[] gfArr = {gf1,gf2,gf3,gf4};

        //3.进行Arrays里面的方法进行排序
        //匿名内部类 lambda表达式
/*        Arrays.sort(gfArr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp==0?o1.getHeight()-o2.getHeight():temp;
                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;

                if (temp==0){
                    return 1;
                }else if (temp<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });*/


        //lambda表达式
        Arrays.sort(gfArr, (GirlFriend o1, GirlFriend o2)-> {
                double temp = o1.getAge() - o2.getAge();
                temp = temp==0?o1.getHeight()-o2.getHeight():temp;
                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;

                if (temp==0){
                    return 1;
                }else if (temp<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        );

        //4.打印一下数组
        System.out.println(Arrays.toString(gfArr));

    }
}
