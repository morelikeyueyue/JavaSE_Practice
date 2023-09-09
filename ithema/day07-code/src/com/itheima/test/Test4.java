package com.itheima.test;

import java.util.Random;

/**
 * @author 25718
 */
public class Test4 {
    /*需求:
    定义方法实现随机产生一个5位的验证码
    验证码格式:长度为5,前四位为大写字母和小写字母
    最后一位是数字;
     */

    //分析:
    //A~Z a~z 0~9
    //可以先把这些数据放到数据中
    //再随机抽取一个索引
    public static void main(String[] args) {
        String yanzhengma = generate();
        System.out.println(yanzhengma);
    }

    //    验证码方法
    //返回一个字符串
    public static String generate() {
        //分析
        //大写字母和小写字母都放到数组中去
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                //添加小写字母
                //a ------97
                chars[i] = (char) (97 + i);
            } else {
                //添加大写字母
                //  A---65
                chars[i] = (char) (65 + i - 26);
            }
        }
        //定义一个字符串类型的变量,用来记录最终的结果
        String result = "";
        //随机抽取4次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chars.length);
            result = result + chars[randomIndex];
        }
        //int randomIndex = r.nextInt(chars.length);
        //再随机抽取一个数字0~9
        int number = r.nextInt(10);
        result = result + number;
        return result;
    }
}
