package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();

        //���ñ���
        jframe.setTitle("�¼���ʾ");
        //���ô�С
        jframe.setSize(603, 680);
        //���ô����ö�
        jframe.setAlwaysOnTop(true);
        //���ý������
        jframe.setLocationRelativeTo(null);
        //���ùر�ģʽ
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //ȡ��Ĭ�ϵľ��з���,���ܷ������
        jframe.setLayout(null);

        //������ť����
        JButton jtb = new JButton("���Ұ�");
        //���ð�ť��λ�ô�С
        jtb.setBounds(0,0,100,50);
        //����ť��Ӷ�������
        //jtb ��ӵ���� addActionListener��ʾ��Ҫ���������ĸ��¼�����
//        jtb.addActionListener(e -> System.out.println("��Ҫ���Ұ�"));
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("��Ҫ���Ұ�");
            }
        });
        //�Ѱ�ť��ӵ�����������
        jframe.add(jtb);

        jframe.setVisible(true);

    }
}
