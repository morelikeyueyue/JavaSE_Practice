package com.itheima.myiotest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
            第三次必定是张三同学

          运行效果：
            第一次运行程序：随机同学姓名1
            第二次运行程序：随机同学姓名2
            第三次运行程序：张三
            …
        */
        //1.读取文件中的所有名字
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br1 = new BufferedReader(new FileReader("myiotest\\src\\com\\itheima\\myiotest2\\allnames.txt"));
        String line;
        while ((line = br1.readLine()) != null){
            list.add(line.split("-")[0]);
        }
        br1.close();

        //2.判断是第几次抽取
        //第三次则直接输出张三
        BufferedReader br2 = new BufferedReader(new FileReader("myiotest\\src\\com\\itheima\\myiotest4\\count.txt"));
        String countStr = br2.readLine();
        br2.close();
        int count = Integer.parseInt(countStr);
        count++;
        if (count!=3){
            //随机抽取
            Collections.shuffle(list);
            System.out.println(list.get(0));
        }else {
            System.out.println("张三");
        }
        //3.把count写入到本地文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest\\src\\com\\itheima\\myiotest4\\count.txt"));
        bw.write(count+"");
        bw.close();




    }
}
