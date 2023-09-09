package com.itheima.myiotest2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*需求：
            需求：
                有一个文件里面存储了班级同学的信息，每一个信息占一行。
                格式为：张三-男-23
                要求通过程序实现随机点名器。

            运行效果：
                第一次运行程序：随机同学姓名1（只显示名字）
                第二次运行程序：随机同学姓名2（只显示名字）
                第三次运行程序：随机同学姓名3（只显示名字）
                …
         */

        //1.读取文件中的所有名字
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\src\\com\\itheima\\myiotest2\\allnames.txt"));
        String line;
        while ((line = br.readLine()) != null){
            list.add(line.split("-")[0]);
        }
        br.close();

        //2.随机抽取
        //方法一:
        Collections.shuffle(list);
        System.out.println(list.get(0));

        //方法二:
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));


    }
}
