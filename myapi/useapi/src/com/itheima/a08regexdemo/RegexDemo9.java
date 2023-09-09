package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        /* 有如下文本，请按照要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
                要求:找出里面所有的JavaXX
         */

        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和JAva11，\n" +
                "因为这两个是长期支持版本，下一个长期支持版本是JAVa17，相信在未来不久jAVA17也会逐渐登上历史舞台";

        //1.定义正则表达式
        // ? 理解为前面的数据java  = 表示在java后面跟随的数据 但是在获取的时候,只获取前半部分
        //需求1 必须有 8 11 17 但是只获取前半部分
        String regex1 = "((?i)Java)(?=8|11|17)" ;
        //需求2
        String regex2 = "((?i)Java)(8|11|17)";
        // : 必须有 8 11 17 都获取
        String regex3 = "((?i)Java)(?:8|11|17)" ;
        //需求3
        // !  去除 8 11 17 以外的
        String regex4 = "((?i)Java)(?!8|11|17)" ;


        //2.创建正则表达式的对象
        Pattern p = Pattern.compile(regex4);

        //3.获取文本匹配器对象
        Matcher m = p.matcher(s);

        //4.输出
        while(m.find()){
            System.out.println(m.group());
        }

    }

}
