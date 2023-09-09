package com.itheima.myclassloader;

public class ClaasLoaderDemo1 {
    public static void main(String[] args) {
        //得到系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //得到平台类加载器
        ClassLoader classLoader1 = systemClassLoader.getParent();

        //得到启动类加载器
        ClassLoader classLoader2 = classLoader1.getParent();

    }
}
