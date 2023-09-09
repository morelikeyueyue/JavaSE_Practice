package com.itheima.a03runtimedemo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJFrame extends JFrame implements ActionListener {
    JButton yesBut = new JButton("帅爆了");
    JButton midBut = new JButton("一般般吧");
    JButton noBut = new JButton("不帅,有点磕碜");
    JButton dadBut = new JButton("饶了我吧!");


    //决定上方按钮是否显示
    boolean flag = false;
    
    public MyJFrame(){
        //初始化界面
        initJFrame();

        //初始化显示
        initView();

        this.setVisible(true);
    }

    private void initView() {

        this.getContentPane().removeAll();

        if (flag) {
            //展示按钮
            dadBut.setBounds(50, 20, 100, 30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }


        JLabel text = new JLabel("你觉得自己帅吗？");
        text.setFont(new Font("微软雅黑", 0, 30));
        text.setBounds(120, 150, 300, 50);


        yesBut.setBounds(200, 250, 100, 30);
        midBut.setBounds(200, 325, 100, 30);
        noBut.setBounds(160, 400, 180, 30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);

        this.getContentPane().repaint();
    }
    private void initJFrame() {
        //设置宽高
        this.setSize(500,600 );
        //设置标题
        this.setTitle("恶搞好基友");
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//3
        //设置置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //取消默认布局
        this.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == yesBut){
            System.out.println("你的好基友点击了帅爆了");
            //给一个弹框
            showJDialog("XXX,你太自信了,给你点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (obj == midBut) {
            System.out.println("你的好基友点击了一般般吧");

            //给一个弹框
            showJDialog("XXX,你还是太自信了,也要给你一点小惩罚吧");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
            
        } else if (obj == noBut) {
            System.out.println("你的好基友点击了不帅");
            //给一个弹框
            showJDialog("XXX,你还是有一点自知之明的,也要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 1800");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (obj == dadBut) {
            System.out.println("你的好基友点击了饶了我吧");
            showJDialog("XXX,这次就饶了你吧");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }

    private void showJDialog(String content) {
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        //设置大小
        jDialog.setSize(200, 150);
/*        //设置标题
        jDialog.setTitle("弹窗");*/
        //让弹窗置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭不能操作其他页面
        jDialog.setModal(true);
        //创建JLabel对象并将文件添加到其中
        JLabel text = new JLabel(content);
        text.setBounds(0,0,200,150);
        jDialog.getContentPane().add(text);
        //让弹框显示出来
        jDialog.setVisible(true);
    }
}
