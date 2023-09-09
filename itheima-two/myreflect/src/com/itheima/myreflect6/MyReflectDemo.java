package com.itheima.myreflect6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class MyReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
    */

        //1.读取配置文件的信息
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("myreflect\\src\\com\\itheima\\prop.properties");
        prop.load(fis);
        fis.close();

        //2.获取全类名的方法名
        String className = (String)prop.get("classname");
        String methodName = (String)prop.get("method");

        //3.利用放射创建对象并运行方法
        Class clazz = Class.forName(className);

        //获取构造方法
        Constructor con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();

        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);


    }
}
