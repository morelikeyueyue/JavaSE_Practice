package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3(){
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

        //����ť������¼�
        this.addKeyListener(this);


        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    //ϸ��:������ǰ���һ������û���ɿ�,��ô���ǻ��ظ���ȥ����KeyPressed�������
    //����������ô�ఴ����ô��������,ÿһ���������и������֮��Ӧ
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("���²���");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("�ɿ�����");
        int keyCode = e.getKeyCode();
        if (keyCode == 65){
            System.out.println("���ڰ�����A");
        } else if (keyCode == 66) {
            System.out.println("���ڰ�����B");
        }
        System.out.println(keyCode);
    }
}
