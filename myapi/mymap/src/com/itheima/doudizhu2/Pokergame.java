package com.itheima.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Pokergame {


    //牌盒
    //此时我们只要把牌跟序号产生对应关系即可,不需要排序
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    /*
        {1=◆3, 2=♣3, 3=♥3, 4=♠3, 5=◆4, 6=♣4, 7=♥4, 8=♠4, 9=◆5, 10=♣5,
         11=♥5, 12=♠5, 13=◆6, 14=♣6, 15=♥6, 16=♠6, 17=◆7, 18=♣7, 19=♥7,
         20=♠7, 21=◆8, 22=♣8, 23=♥8, 24=♠8, 25=◆9, 26=♣9, 27=♥9, 28=♠9,
         29=◆10, 30=♣10, 31=♥10, 32=♠10, 33=◆J, 34=♣J, 35=♥J, 36=♠J, 37=◆Q,
          38=♣Q, 39=♥Q, 40=♠Q, 41=◆k, 42=♣k, 43=♥k, 44=♠k, 45=◆A, 46=♣A, 47=♥A,
          48=♠A, 49=◆2, 50=♣2, 51=♥2, 52=♠2, 53=小王, 54=大王}
        */
    static {
        //准备牌
        String[] color = {"◆", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"};

        int serialNumber = 1;
        for (String n : number) {
            //n 依次表示每一个数字
            for (String c : color) {
                //c依次表示每一种花色
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }

        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

        //System.out.println(hm);
        //System.out.println(list);

    }

    public Pokergame() {
        //准备牌

        //洗牌
        Collections.shuffle(list);

        //发牌
        //4个集合存储牌
        TreeSet<Integer> discards = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();


        //遍历牌盒,得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if (i < 3) {
                discards.add(serialNumber);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else if (i % 3 == 2) {
                player3.add(serialNumber);
            }

        }
/*        System.out.println(discards.size());
        System.out.println(player1.size());
        System.out.println(player2.size());
        System.out.println(player3.size());*/


        //看牌
        lookPoker("底牌", discards);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);


        //System.out.println(list);
    }


    /*
    参数一:玩家的名字
    参数二:每位玩家的牌
     */
    public void lookPoker(String name, TreeSet<Integer> ts) {
        //遍历treeset集合得到每一个序号,再拿着序号去map集合中找真正的牌
        System.out.print(name + ": ");
        for (Integer serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
