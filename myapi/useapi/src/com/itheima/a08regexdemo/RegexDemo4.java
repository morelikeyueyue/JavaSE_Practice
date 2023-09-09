package com.itheima.a08regexdemo;

public class RegexDemo4 {
    public static void main(String[] args) {

        /*
            需求
            请编写正则表达式验证用户输入的手机号码是否满足要求。请编写正则表达式验证用户输入的邮箱号是否满足要求。请编写正则表达式验证用户输入的电话号码是否满足要求。
            验证手机号码 13112345678 13712345667 13945679027 139456790271
            验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
            验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
         */


        //心得:
        //拿着一个正确的数据,从左到右依次去写: 13112345678
        System.out.println("------------1------------");
        String regex1="1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1)); //true
        System.out.println("13712345667".matches(regex1)); //true
        System.out.println("13945679027".matches(regex1)); //true
        System.out.println("139456790271".matches(regex1)); //false

        //座机电话号码
        //020-2324242 02122442 027-42424 0712-3242434
        //思路:
        //在书写座机号正则的时候需要把正确的数据分为三部分
        //一:区号@\\d{2,3}
        //      0:表示区号一定是以0开头的
        //      \\d{2,3}:表示区号从第二位开始可以是任意的数字，可以出现2到3次。
        //二:- ?表示次数，日次或一次
        //三:号码 号码的第一位也不能以日开头，从第二位开始可以是任意的数字，号码的总长度:5-10位
        System.out.println("------------2------------");
        String regex2="0[^0]\\d{1,2}-?^0\\d{4,9}" ;
        System.out.println("020-2324242".matches(regex2)); //true
        System.out.println("02122442".matches(regex2)); //true
        System.out.println("027-42424".matches(regex2)); //true
        System.out.println("0712-3242434".matches(regex2)); //true


        //邮箱号码
        //3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //思路:
        //在书写邮箱号码正则的时候需要把正确的数据分为三部分
        //第一部分:@的左边 \\w+
        //      任意的字母数字下划线，至少出现一次就可以了
        //第二部分:@ 只能出现一次
        //第三部分:
        //      3.1         .的左边[\\w&&[^_]]{2,6}
        //                  任意的字母加数字，总共出现2-6次(此时不能出现下划线)
        //      3.2         . \\. 转义字符 直接写.是匹配任意字符
        //      3.3         大写字母，小写字母都可以，只能出现2-3次[a-zA-Z]{2,3}
        //      我们可以把3.2和3.3看成一组，这一组可以出现1次或者两次
        System.out.println("------------3------------");
        String regex3="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}" ;
        System.out.println("3232323@qq.com".matches(regex3)); //true
        System.out.println("zhangsan@itcast.cnn".matches(regex3)); //true
        System.out.println("dlei0009@163.com".matches(regex3)); //true
        System.out.println("dlei0009@pci.com.cn".matches(regex3)); //false


        String regex4 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:11".matches(regex4));//true

    }
}
