package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    //创建按钮对象
    JButton jtb1 = new JButton("点我");
    JButton jtb2 = new JButton("不点我");
    public MyJFrame() {

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


        //设置按钮的位置大小
        jtb1.setBounds(0,0,100,50);
        jtb1.addActionListener(this);


        //设置按钮的位置大小
        jtb2.setBounds(100,0,100,50);
        jtb2.addActionListener(this);

        //添加
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前的按钮进行判断
        Object source = e.getSource();
        if (source == jtb1){
            jtb1.setSize(200,200);
        }else if (source == jtb2){
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
