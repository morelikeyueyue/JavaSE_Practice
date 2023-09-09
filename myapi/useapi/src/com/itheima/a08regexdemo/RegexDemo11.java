package com.itheima.a08regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {
        //public string replaceAll(string regex,string newstr) 按照正则表达式的规则进行替换
        //public string[] split(string regex): 按照正则表达式的规则切割字符串

        /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来*/

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String regex1 = "[\\w&&[^_]]+";
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串里面的内容,只要有满足的,那么就用第二个参数去替换
//        String result = s.replaceAll(regex1, "vs");
//        System.out.println(result);


        String[] split = s.split(regex1);
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+", ");
        }

    }
}
