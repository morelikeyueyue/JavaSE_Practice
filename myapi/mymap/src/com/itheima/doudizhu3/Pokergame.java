package com.itheima.doudizhu3;

import java.util.*;

public class Pokergame {


    static HashMap<String, Integer> hm = new HashMap<>();
    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    static {
        //准备牌
        String[] color = {"♠", "♣", "♥", "◆"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        for (String c : color) {
            //c依次表示每一种花色
            for (String n : number) {
                list.add(c + n);
            }
        }

        list.add(" 小王");
        list.add(" 大王");

        //指定牌的价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);

    }

    public Pokergame() {
        //准备牌


        //洗牌
        Collections.shuffle(list);

        //发牌
        //4个集合存储牌
        ArrayList<String> discards = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();


        //遍历牌盒,得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i<3){
                discards.add(poker);
                continue;
            }
            if (i%3==0){
                player1.add(poker);
            } else if (i%3==1) {
                player2.add(poker);
            } else if (i%3==2) {
                player3.add(poker);
            }

        }

        //排序
        order(discards);
        order(player1);
        order(player2);
        order(player3);


        //看牌
        lookPoker("底牌",discards);
        lookPoker("玩家一",player1);
        lookPoker("玩家二",player2);
        lookPoker("玩家三",player3);


    }


    /*
    参数一:玩家的名字
    参数二:每位玩家的牌
     */
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name+": ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }

    //利用牌的价值来排序
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            //Arrays.sort (插入排序+二分查找)
            @Override
            public int compare(String o1, String o2) {
                //o1表示当前要插入的牌
                //o2表示已经插入的牌

                //负数:o1小 在左边
                //整数:o1大 在右边
                //0 一样大,需要按照花色再次排序

                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);


                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                int i = value1 - value2;

                return i==0 ? color1.compareTo(color2) : i;
            }
        });
    }

    //计算牌的价值
    //参数:牌
    //返回值:价值
    public int getValue(String poker){
        //获取牌的数字
        String number = poker.substring(1);
        //拿着数字到map集合中去判断是否存在,存在,获取价值,不存在,类型转换
        if(hm.containsKey(number)){
            //存在
            return hm.get(number);
        }else {
            //不存在
            return Integer.parseInt(number);
        }

    }
}
