package com.itheima.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    JButton jtb1 = new JButton("���Ұ�");
    public MyJFrame2(){
        //���ñ���
        this.setTitle("�¼���ʾ");
        //���ô�С
        this.setSize(603, 680);
        //���ô����ö�
        this.setAlwaysOnTop(true);
        //���ý������
        this.setLocationRelativeTo(null);
        //���ùر�ģʽ
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //ȡ��Ĭ�ϵľ��з���,���ܷ������
        this.setLayout(null);

        jtb1.setBounds(0,0,100,50);
        //����ť������¼�
        jtb1.addMouseListener(this);


        this.getContentPane().add(jtb1);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("����");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("���²���");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("�ɿ�");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("����");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("����");
    }
}
