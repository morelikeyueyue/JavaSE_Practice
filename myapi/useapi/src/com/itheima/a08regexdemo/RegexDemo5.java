package com.itheima.a08regexdemo;

public class RegexDemo5 {
    public static void main(String[] args) {
    /*
    需求
        请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位
        请编写正则表达式验证身份证号码是否满足要求。
        简单要求:
        18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        复杂要求:
        按照身份证号码的格式严格要求。

	身份证号码:
		41080119930228457x
		510801197609022309
		15040119810705387X
		130133197204039024
		430102197606046442

		*/

        String regex1 ="\\w{4,16}";
        System.out.println("a12".matches(regex1));//false
        System.out.println("a123".matches(regex1));//true
        System.out.println("a123_1524".matches(regex1));//true

        System.out.println();
        String regex2 ="\\d{17}[\\dxX]";  //  "\\d{17}(\\d|x|X)"
        String regex4 ="\\d{17}(\\d|(?i)x)";
        System.out.println("41080119930228457x".matches(regex4));
        System.out.println("510801197609022309".matches(regex4));
        System.out.println("15040119810705387X".matches(regex4));
        System.out.println("130133197204039024".matches(regex4));
        System.out.println("430102197606046442".matches(regex4));


        //忽略大小写的书写方式
        //在匹配的时候忽略abc的大小写
/*        System.out.println();
        String regex3 ="a((?i)b)c";
        System.out.println("abc".matches(regex3));
        System.out.println("aBC".matches(regex3));
        System.out.println("ABC".matches(regex3));*/

        //身份证号码的严格校验
        // 前6位 第一位不能是0 其他任意数字  [1-9]\d{5}
        // 年前半 18 19 20   (18||19||20)
        // 年后半 00~99        \d{2}
        // 月份 01~09 10 11 12        (0[1-9]|1[0-2])
        // 日期 01~09 10~19 20~29 30 31   (0[1-9]|[12]\d|3[01])
        // 最后四位 任意数字三次 任意数字或者X X  \\d{3}(\\d(|?i)x)
        System.out.println();
        String regex5 ="[1-9]\\d{5}(18||19||20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println("41080119930228457x".matches(regex5));
        System.out.println("510801197609022309".matches(regex5));
        System.out.println("15040119810705387X".matches(regex5));
        System.out.println("130133197204039024".matches(regex5));
        System.out.println("430102197606046442".matches(regex5));

        System.out.println();
        String regex6 ="a?";
        System.out.println("aaa".matches(regex6));
        System.out.println("a".matches(regex6));
        System.out.println("b".matches(regex6));

    }

}
