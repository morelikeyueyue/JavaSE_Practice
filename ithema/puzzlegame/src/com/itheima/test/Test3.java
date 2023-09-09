package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();

        //设置标题
        jframe.setTitle("事件演示");
        //设置大小
        jframe.setSize(603, 680);
        //设置窗口置顶
        jframe.setAlwaysOnTop(true);
        //设置界面居中
        jframe.setLocationRelativeTo(null);
        //设置关闭模式
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,才能放置组件
        jframe.setLayout(null);

        //创建按钮对象
        JButton jtb = new JButton("点我啊");
        //设置按钮的位置大小
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jtb 添加的组件 addActionListener表示我要给组件添加哪个事件监听
//        jtb.addActionListener(e -> System.out.println("不要点我啊"));
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我啊");
            }
        });
        //把按钮添加到整个界面中
        jframe.add(jtb);

        jframe.setVisible(true);

    }
}
