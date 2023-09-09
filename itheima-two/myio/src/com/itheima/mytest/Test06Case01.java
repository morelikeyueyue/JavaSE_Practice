package com.itheima.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Test06Case01 {
    public static void main(String[] args) throws IOException {
            /*
                需求：把《出师表》的文章顺序进行恢复到一个新文件中。
            */

        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("D:\\aaa\\csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
//        System.out.println(list);
        br.close();

        //2.排序
        //排序规则:按照每一行前面的序号进行排列
        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //获取o1和o2的序号
/*                int num1 = Integer.parseInt(String.valueOf(o1.charAt(0)));
                int num2 = Integer.parseInt(String.valueOf(o2.charAt(0)));*/

                int num1 = Integer.parseInt(o1.split("\\.")[0]);
                int num2 = Integer.parseInt(o2.split("\\.")[0]);
                return num1 - num2;
            }
        });
//        System.out.println(list);

        //3.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\copy1.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();





    }
}
