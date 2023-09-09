package com.itheima.a02jdk7simpledateformatdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        String beginStr = "2023年11月11日 00:00:00";
        String endStr = "2023年11月11日 00:10:00";
        String user1 = "2023年11月11日 00:01:00";
        String user2 = "2023年11月11日 00:11:00";

        //1.判断活动开始和结束时间(解析)
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date beginDate = sdf1.parse(beginStr);
        Date endDate = sdf1.parse(endStr);
        long begin = beginDate.getTime();
        long end = endDate.getTime();
        //2.输入用户下单的时间(解析)
        ArrayList<Date> list = new ArrayList<>();
        Date user1Date = sdf1.parse(user1);
        Date user2Date = sdf1.parse(user2);
        list.add(user1Date);
        list.add(user2Date);
        //3.判断是否参加
        for (int i = 0; i < list.size(); i++) {
            Date d1 = list.get(i);
            if (d1.getTime()>begin&&d1.getTime()<end){
                System.out.println("用户"+(i+1)+"参加上了秒杀活动");
            }else{
                System.out.println("用户"+(i+1)+"没有参加上了秒杀活动");
            }
        }

    }
}
