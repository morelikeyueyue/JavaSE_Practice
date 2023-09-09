package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        /* 有如下文本，请按照要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
                要求:找出里面所有的JavaXX
         */

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                " 因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";


//        method1(str);
/*        while(m.find()){
            System.out.println(m.group());
        }*/


/*        String temp = "		<td align=\"center\"><h1>您查询的IP:113.106.249.14</h1></td>";
        String REGEX_EXP = ".*<td align=\"center\"><h1>您查询的IP:(113\\.106\\.249\\.14)</h1></td>.*";
        Pattern p1 = Pattern.compile(REGEX_EXP);
        System.out.println(p1.matcher(temp).matches());
        Matcher matcher = p1.matcher(temp);
        while(matcher.find()){
            System.out.println(matcher.group(1));*/

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.获取文本匹配器的对象
        Matcher m = p.matcher(str);
//        System.out.println(m.matches());
        //3.利用循环获取
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }


        }


    private static void method1(String str) {
        //Pattern
        //Matcher

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        //m 文本匹配器的对象
        //str 大串
        //p 规则
        //m要在str里面找符合p的小串
//        System.out.println(p.matcher(str).matches());
        Matcher m =p.matcher(str);

        //拿着文本匹配器从头开始读取,寻找是否有满足规则的字串
        //没有返回 false
        //有返回true 并且在底层会记录字串的起始索引和结束索引+1
        boolean b = m.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //substring(起始索引,结束索引)包头不包尾
        //会把截取的小串进行返回
        String s1 = m.group();
        System.out.println(s1);

        b = m.find();
        String s2 = m.group();
        System.out.println(s2);
    }
}
