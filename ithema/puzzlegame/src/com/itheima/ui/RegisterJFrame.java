package com.itheima.ui;

import com.itheima.UserInfo.User;
import com.itheima.util.JDialogUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements MouseListener {
    //ע�����

    //�û���\���������
    JTextField username = new JTextField();
    JTextField password= new JTextField();
    JTextField againPassword = new JTextField();

    //ע��\���ð�ť
    JButton register= new JButton();
    JButton reset= new JButton();


    public RegisterJFrame(){

        //��ʼ������
        initJFrame();

        //�������
        initView();

        //�ý���չʾ����
        this.setVisible(true);

    }

    //�ڳ�ʼ���������������
    private void initView() {
        //���ԭ���Ѿ����ֵ�ͼƬ
        this.getContentPane().removeAll();

        //1.���ע���û�������
        JLabel registUsername = new JLabel(new ImageIcon("image\\register\\ע���û���.png"));
        registUsername.setBounds(60, 125,79,17);
        this.getContentPane().add(registUsername);

        //2.���ע���û��������
        username.setBounds(170,120,200,30 );
        this.getContentPane().add(username);

        //3.���ע����������
        JLabel registPassword = new JLabel(new ImageIcon("image\\register\\ע������.png"));
        registPassword.setBounds(65,185,64,16);
        this.getContentPane().add(registPassword);

        //4.���ע�����������
        password.setBounds(170,180,200,30);
        this.getContentPane().add(password);

        //5.����ٴ�������������
        JLabel registerAgainPd = new JLabel(new ImageIcon("image\\register\\ע������.png"));
        registerAgainPd.setBounds(50,245,96,17);
        this.getContentPane().add(registerAgainPd);

        //6.����ٴ��������������
        againPassword.setBounds(170,240,200,30);
        this.getContentPane().add(againPassword);

        //7.���ע�ᰴť
        register.setBounds(70,320,128,47);
        register.setIcon(new ImageIcon("image\\register\\ע�ᰴť.png"));
        //ȥ���߿�
        register.setBorderPainted(false);
        //ȥ������
        register.setContentAreaFilled(false);
        //��ע�ᰴť����갴��
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //8.������ð�ť
        reset.setBounds(270,320,128,47);
        reset.setIcon(new ImageIcon("image\\register\\���ð�ť.png"));
        //ȥ���߿�
        reset.setBorderPainted(false);
        //ȥ������
        reset.setContentAreaFilled(false);
        //�����ð�ť����갴��
        reset.addMouseListener(this);
        this.getContentPane().add(reset);

        //9.��ӱ���
        JLabel background = new JLabel(new ImageIcon("image\\register\\background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
        //ˢ��һ�½���
        this.getContentPane().repaint();


    }

    //��ʼ������
    private void initJFrame() {
        //����һ��ע�����,���ÿ��
        this.setSize(488,430);
        this.setVisible(true);
        //���ý���ı���
        this.setTitle("ƴͼ ע��");
        //���ý����ö�
        this.setAlwaysOnTop(true);
        //���ý������
        this.setLocationRelativeTo(null);
        //������Ϸ�Ĺر�ģʽ
        this.setDefaultCloseOperation(3);//WindowConstants.EXIT_ON_CLOSE
        //ȡ��Ĭ�ϵľ��з���,�������ܷ������
        this.setLayout(null);
    }

    //�ж��û��Ƿ����
/*    public boolean contains(User userInput){
        for (int i = 0; i < LoginJFrame.list.size(); i++) {
            //�½��û�����,�õ������е��û�
            User u = LoginJFrame.list.get(i);
            System.out.println(u.getUsername()+"  "+u.getPassword());
            if (u.getUsername().equals(userInput.getUsername())&&u.getPassword().equals(userInput.getPassword())){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }*/

    //�����
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== register){
            System.out.println("�����ע�ᰴť");
            //�õ�������û��� ���� �ٴ����������
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            String againPdInput = againPassword.getText();

            System.out.println(usernameInput);
            System.out.println(passwordInput);
            System.out.println(againPdInput);

            //����һ��user����
            User userRegister = new User(usernameInput,passwordInput);
            System.out.println("�û�ע����û���Ϊ"+userRegister.getUsername());
            System.out.println("�û�ע�������Ϊ"+userRegister.getPassword());

            if (usernameInput.length()==0||passwordInput.length()==0){
                JDialogUtil.showJDialog("�û����������벻��Ϊ��");
            }else if (!passwordInput.equals(againPdInput)){
                //�����������벻һ��
                JDialogUtil.showJDialog("�����������벻һ��");
            }else if (LoginJFrame.contains(userRegister)){
                JDialogUtil.showJDialog("���û��Ѿ�����");
            }else{
                //��֤�ɹ�
                LoginJFrame.list.add(userRegister);
                System.out.println(userRegister.getUsername()+"�Ѿ��ɹ�ע��");
                JDialogUtil.showJDialog("ע��ɹ�");

                //�رյ�ǰ����
                this.setVisible(false);

                //���ص�¼����
                new LoginJFrame();

/*                //����loginJFrame�����list�鿴�Ƿ����
                for (int i = 0; i < LoginJFrame.list.size(); i++) {
                    User u = LoginJFrame.list.get(i);
                    System.out.println("�û���Ϊ:"+u.getUsername()+"\n����Ϊ:"+u.getPassword());
                }*/
            }

        }else if (e.getSource()== reset){
            System.out.println("��������ð�ť");
            //������������������
            username.setText("");
            password.setText("");
            againPassword.setText("");

        }
    }

    //���²���
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == register){
            System.out.println("����ע��");
            register.setIcon(new ImageIcon("image\\register\\ע�ᰴ��.png"));
        } else if (e.getSource() == reset) {
            System.out.println("��������");
            reset.setIcon(new ImageIcon("image\\register\\���ð���.png"));
        }
    }

    //�ɿ�����
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == register){
            System.out.println("�ɿ�ע��");
            register.setIcon(new ImageIcon("image\\register\\ע�ᰴť.png"));
        } else if (e.getSource() == reset) {
            System.out.println("�ɿ�����");
            reset.setIcon(new ImageIcon("image\\register\\���ð�ť.png"));
        }
    }

    //�������
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    //����Ƴ�
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
