package com.itheima.test2;

public class NameFormatException extends RuntimeException {
    //技巧:
    //NameFormat 当前异常的名字,表示姓名格式化异常
    //Exception 表示当前类是一个异常类



    //运行时:RuntimeException 由于参数错误而导致的异常
    //编译时:Exception 提醒程序员去检查本地信息


    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
