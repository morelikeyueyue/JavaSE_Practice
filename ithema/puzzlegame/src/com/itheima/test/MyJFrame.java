package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    //������ť����
    JButton jtb1 = new JButton("����");
    JButton jtb2 = new JButton("������");
    public MyJFrame() {

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


        //���ð�ť��λ�ô�С
        jtb1.setBounds(0,0,100,50);
        jtb1.addActionListener(this);


        //���ð�ť��λ�ô�С
        jtb2.setBounds(100,0,100,50);
        jtb2.addActionListener(this);

        //���
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //�Ե�ǰ�İ�ť�����ж�
        Object source = e.getSource();
        if (source == jtb1){
            jtb1.setSize(200,200);
        }else if (source == jtb2){
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
