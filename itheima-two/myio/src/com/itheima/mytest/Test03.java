package com.itheima.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test03 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
        */
        //第一种
        //1.读取数据源
        FileReader fr = new FileReader("myio\\a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);
        //2.排序
        String str = sb.toString();
        String[] arrstr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrstr) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        System.out.println(list);
        //3.写入目的地
        FileWriter fw = new FileWriter("myio\\a.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                fw.write(list.get(i)+"");
            }else {
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
