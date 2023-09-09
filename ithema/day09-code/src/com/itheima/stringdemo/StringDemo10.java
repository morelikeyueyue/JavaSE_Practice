package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
/*        身份证查看:           人物信息位:
        7-14位 出生年月日          出生年月日:XXXX年X月X日
        17位 性别                  性别为:男/女
        */

        //1.定义一个字符串记录身份证号码
        String id = "321281202001011234";

        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
//        System.out.println(year+" "+month+" "+day);
        System.out.println("人物信息位:");
        System.out.printf("出身年月日为:%s年%s月%s日\n", year, month, day);

        //3.获取性别
        char gender = id.charAt(16);
        int genderNumber = gender - '0';
//        System.out.println(genderNumber);
        if(genderNumber%2==0) {
            //女
            System.out.println("性别为:女");
        }else{
            //男
            System.out.println("性别为:男");
        }

    }
}