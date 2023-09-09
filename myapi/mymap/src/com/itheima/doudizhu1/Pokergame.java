package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Pokergame {



    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    static {
        //准备牌
        String[] color = {"♠", "♣", "♥", "◆"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"};


        for (String c : color) {
            //c依次表示每一种花色
            for (String n : number) {
                list.add(c + n);
            }
        }

        list.add("小王");
        list.add("大王");

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


        //看牌
        lookPoker("底牌",discards);
        lookPoker("玩家一",player1);
        lookPoker("玩家二",player2);
        lookPoker("玩家三",player3);


        //System.out.println(list);
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
}
