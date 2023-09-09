package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    /*
    if(){
    }else if(){
    }else{
    }
     */
    /*分析
    1.键盘录入小明的成绩
    2.根据不同的考试成绩,给出不同的奖励
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        int score = sc.nextInt();

        //对异常数据进行判断校验
        //0到100才是合理数据
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("送一辆自行车");
            } else if (score >= 90 && score < 95) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score < 90) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        } else {
            System.out.println("当前录入成绩不合理");
        }
    }
}