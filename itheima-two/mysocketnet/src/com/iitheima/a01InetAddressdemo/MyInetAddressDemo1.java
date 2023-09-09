package com.iitheima.a01InetAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
/*
        static InetAddress getByName(String host)  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName()                        获取此IP地址的主机名
        String getHostAddress()                     返回文本显示中的IP地址字符串
*/

        //1.获取InetAddress的对象
        //IP的对象 一台电脑的对象
        InetAddress address1 = InetAddress.getByName("192.168.137.1");
        System.out.println(address1);

        String name = address1.getHostName();
        System.out.println(name);

        String ip = address1.getHostAddress();
        System.out.println(ip);

        InetAddress address2 = InetAddress.getByName("smr0.mshome.net");
        System.out.println(address2);

        String name1 = address2.getHostName();
        System.out.println(name1);

        String ip1 = address2.getHostAddress();
        System.out.println(ip1);


    }
}
