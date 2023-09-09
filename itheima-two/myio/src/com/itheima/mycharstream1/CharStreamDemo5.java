package com.itheima.mycharstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("myio\\a.txt");


        fw.write("我");
        fw.write("说");
        fw.write("你");

        fw.flush();

        fw.write("都");
        fw.write("超");

        fw.close();

         System.out.println("------------");
    }
}
