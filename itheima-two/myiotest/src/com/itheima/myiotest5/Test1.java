package com.itheima.myiotest5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。

          运行结果要求：
            被点到的学生不会再被点到。
            但是如果班级中所有的学生都点完了， 需要重新开启第二轮点名。

          核心思想：
               点一个删一个，把删除的备份，全部点完时还原数据。

        */
        //1.定义变量表示刚开始的存储学生姓名文件的路径
        String src = "myiotest\\src\\com\\itheima\\myiotest5\\allnames.txt";
        //2.定义变量表示临时存储学生姓名文件的路径
        String temp = "myiotest\\src\\com\\itheima\\myiotest5\\temp.txt";

        //3.读取src路径中所有的学生姓名
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        while (true) {
            if (count ==60){
                break;
            }
            list = readFile(src);
            //开始随机点名
            //判断list的长度是否为0 为0则空,将备份文件中的数据转移到src中,并且删除备份文件
            if(list.size()==0){
                list = readFile(temp);
                writeFile(src,list,false);
                new File(temp).delete();
            }
            //点名 点到的冲集合中删去 并且添加到temp集合中
            //再将集合剩下的元素写入到src文件中
            Collections.shuffle(list);
            String stuInfo = list.get(0);
            System.out.println(stuInfo.split("-")[0]);
            //当前姓名在集合中删去
            list.remove(0);
            //将集合写到src文件中
            writeFile(src,list,false);
            //将stuInfo中的信息写到temp文件中 追加写入
            writeFile(temp,stuInfo,true);
            count++;
        }

    }

    private static void writeFile(String temp, String stuInfo, boolean isAppend) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp,isAppend));
        bw.write(stuInfo);
        bw.newLine();
        bw.close();
    }

    private static void writeFile(String pathSrc, ArrayList<String> list, boolean isAppend) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathSrc,isAppend));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    private static ArrayList<String> readFile(String src) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(src));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        return list;
    }
}
