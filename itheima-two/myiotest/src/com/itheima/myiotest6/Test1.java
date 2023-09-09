package com.itheima.myiotest6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.把文件中所有的学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\src\\com\\itheima\\myiotest6\\names.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            Student s = new Student(arr[0], arr[1], Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(s);
        }
        br.close();
        //        System.out.println(list);

        //2.计算权重的总和
        double weight = 0;
        for (Student stu : list) {
            weight+=stu.getWieght();
        }
//        System.out.println(weight);

        //3.计算每一个人的实际占比
        double[] arr = new double[list.size()];
        int index =0;
        for (Student stu : list) {
            arr[index]=stu.getWieght()/weight;
            index++;
        }
//        System.out.println(Arrays.toString(arr));

        //4.计算每一个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i]+arr[i-1];
        }
//        System.out.println(Arrays.toString(arr));

        //5.随机抽取
        //获取一个0.0到1.0之前的随机数
        double number = Math.random();
        //判断number在arr之间的位置
        //方法返回值: -插入点-1
        int result = -1-Arrays.binarySearch(arr, number);

        Student stu = list.get(result);

//        System.out.println(stu);

        //6.修改当前学生的权重
        double w = stu.getWieght()/2;
        stu.setWieght(w);
        System.out.println(stu);

        System.out.println(list);
        //7.将修改后的数据再次写入文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest\\src\\com\\itheima\\myiotest6\\names.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();


    }
}
