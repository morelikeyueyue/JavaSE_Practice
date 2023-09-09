package com.itheima.myiotest3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的信息，格式为：张三-男-23
            每一个学生信息占一行。
            要求通过程序实现随机点名器。
            70%的概率随机到男生
            30%的概率随机到女生
            随机100万次，统计结果。看生成男生和女生的比例是不是接近于7：3
        */

        //1.从本地文件中读取数据,将男女分别存储
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\src\\com\\itheima\\myiotest2\\allnames.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            if (arr[1].equals("男")) {
                boyList.add(arr[0]);
            } else {
                girlList.add(arr[0]);
            }
        }
        br.close();

        //2.定义权重集合 男女比例为 7:3
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);

        //3.随机抽取0,1
        //抽到1到boylist里面随机抽取名字 0则到girlList里面随机
        Random r = new Random();
/*        int index = r.nextInt(list.size());
        if (list.get(index)==1){
            System.out.println(boyList.get(r.nextInt(boyList.size())));
        }else {
            System.out.println(girlList.get(r.nextInt(girlList.size())));
        }*/


        //3.随机100万次
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < 1000000; i++) {
            int index = r.nextInt(list.size());
            int weight = list.get(index);
            if (weight == 1) {
                Collections.shuffle(boyList);
                boyCount++;
            }else {
                Collections.shuffle(girlList);
                girlCount++;
            }
        }
        System.out.println(boyCount);
        System.out.println(girlCount);
        System.out.println((boyCount*1.0/girlCount)*100);


    }
}
