package com.itheima.a08regexdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) throws IOException {
        /* 扩展需求2:
            把连接:https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i
            http://www.czxww.cn/mobile/content/2022-08/02/content_1326647.html
            中所有的身份证号码都爬取出来。
        */


        //创建一个url对象
        URL url;
        try {
            url = new URL("http://yzwb.sjzdaily.com.cn/yzwbpaper/pad/content/202206/15/content_88415.html");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        //链接上这个网址
        //细节:保证网络是畅通的
        URLConnection conn = url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //获取正则表达式的对象
        String regex = "[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);
        //每次读取的时候都是读取一整行
        while ((line = br.readLine()) != null){
//            System.out.println(line);
            //拿着文本匹配器的对象matcher按照pattern的规则去读取当前这一行的信息
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();

    }
}
