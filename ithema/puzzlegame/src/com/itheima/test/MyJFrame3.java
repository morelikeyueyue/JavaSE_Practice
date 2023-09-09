package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3(){
        //设置标题
        this.setTitle("事件演示");
        //设置大小
        this.setSize(603, 680);
        //设置窗口置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,才能放置组件
        this.setLayout(null);

        //给按钮绑定鼠标事件
        this.addKeyListener(this);


        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    //细节:如果我们按下一个按键没有松开,那么我们会重复的去调用KeyPressed这个方法
    //键盘里面那么多按键怎么进行区分,每一个按键都有个编号与之对应
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        int keyCode = e.getKeyCode();
        if (keyCode == 65){
            System.out.println("现在按的是A");
        } else if (keyCode == 66) {
            System.out.println("现在按的是B");
        }
        System.out.println(keyCode);
    }
}
