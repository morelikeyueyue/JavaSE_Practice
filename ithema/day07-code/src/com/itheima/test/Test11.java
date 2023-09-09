package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*需求:
        投注号码由6个红球和1个蓝球组成
        红球从1~33中选择,蓝球在1~16中选择
         */
        //分析:
        //1.系统随机生成中奖号码
        int[] arr =createNumbers();
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //2.用户输入购买的号码
        int[] userInputArr = userInputNumber();
//        for (int i = 0; i < userInputArr.length; i++) {
//            System.out.print(userInputArr[i]+" ");
//        }
        //3.系统判断是否中奖
        conpareArray(arr, userInputArr);
    }

    //创建中奖号码
    public static int[] createNumbers(){
        //1.创建数组用户添加中奖号码
        //6个红球 1个篮球 数组长度:7
        int[] arr=new int[7];

        //2.随机生成号码并且添加到数组中
//        生成红球号码并添加到数组中
        Random r = new Random();
        for (int i = 0; i < 6;) {
            //获取红球号码
            int readNumber=r.nextInt(33)+1;
            boolean flag = contains(arr,readNumber);
            if (!flag){
                //把红球号码添加到数组当中
                arr[i] = readNumber;
                i++;
            }
        }
        int buleNumber =  r.nextInt(16)+1;
        arr[arr.length-1] = buleNumber;
        return arr;
    }

    //判读数据在数组中是否存在
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }

    //用户输入号码
    public static int[] userInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i+1) + "个红球号码:");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    //不存在
                    arr[i] = redNumber;
                    i++;
                } else {
                    //存在
                    System.out.println("当前红球号码已经存在,请重新输入");
                }

            } else {
                System.out.println("当前红球号码超出范围");
            }
        }
        System.out.println("请输入购买的第七个蓝球号码:");
        //判断蓝球范围在1~16
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("输入的蓝球号码超出范围");
            }
        }
        return arr;
    }

    //判断是否中奖
    public static void conpareArray(int[] arr, int[] userInputArr){
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputArr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (userInputArr[i] ==arr[j]){
                    redCount++;
                    break;
                }
            }
        }
        if (arr[arr.length-1] == userInputArr[userInputArr.length-1]){
            blueCount++;
        }
        System.out.println("红球的中奖数:"+redCount);
        System.out.println("蓝球的中奖数:"+blueCount);
        scorecompare(redCount,blueCount);
    }

    //中奖情况
    private static void scorecompare(int redCount,int blueNumber){
        if (redCount ==6&&blueNumber==1){
            System.out.println("恭喜你,中奖1000万");
        } else if (redCount ==6&&blueNumber==0) {
            System.out.println("恭喜你,中奖500万");
        } else if (redCount ==5&&blueNumber==1) {
            System.out.println("恭喜你,中奖3000");
        }else if (redCount ==5&&blueNumber==0||redCount ==4&&blueNumber==1) {
            System.out.println("恭喜你,中奖200");
        }else if (redCount ==4&&blueNumber==0||redCount ==3&&blueNumber==1) {
            System.out.println("恭喜你,中奖10");
        }else if (redCount ==2&&blueNumber==1||redCount ==1&&blueNumber==1||redCount ==0&&blueNumber==1) {
            System.out.println("恭喜你,中奖5");
        }else {
            System.out.println("未中奖");
        }
    }
}
