package com.itheima.a02systemdemo1;

public class SystemDemo1 {
    public static void main(String[] args) {
        //exit 终止运行的java虚拟机
        //currentTimeMillis() 返回当前系统时间的毫秒值形式 返回值 long
        //arraycopy(数据源数组,起始索引,目的地数组,起始索引,拷贝个数)  数组拷贝
        //都是static修饰 类名.方法名 调用



        //方法的形参 0 表示虚拟机是正常停止 非0 当前虚拟机是异常停止
        //System.exit(0);

        //System.out.println("看看我执行了吗");


        long time = System.currentTimeMillis();
        System.out.println(time); //1673509269246

    }
}
