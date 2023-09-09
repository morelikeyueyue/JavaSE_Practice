package com.itheima.ui;

import com.itheima.UserInfo.User;
import com.itheima.util.CodeUtil;
import com.itheima.util.JDialogUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class LoginJFrame extends JFrame implements MouseListener {
    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("zhangsan", "123"));
        list.add(new User("lisi", "1234"));
    }

    //��¼\ע�ᰴť
    JButton login = new JButton();
    JButton register = new JButton();

    //�û��� ���� ��֤�������
    JTextField username = new JTextField();
    //JPasswordField ��������
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();

    //��ȷ����֤��
    JLabel rightCode = new JLabel();


    //��¼����
    public LoginJFrame() {

        //��ʼ������
        initJFrame();

        //��ʼ��ͼ��
        initImage();

        //�ý�����ʾ����,д�����
        this.setVisible(true);
    }

    //��ʼ��ͼ��
    private void initImage() {
        //���ԭ���Ѿ����ֵ�ͼƬ
        this.getContentPane().removeAll();

        //1. ����û�������
        JLabel usernameText = new JLabel(new ImageIcon("image\\login\\�û���.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.����û��������
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.�����������
        JLabel passwordText = new JLabel(new ImageIcon("image\\login\\����.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.���������
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //5.��֤����ʾ
        JLabel CodeText = new JLabel(new ImageIcon("image\\login\\��֤��.png"));
        CodeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(CodeText);

        //6.��֤�������
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        String codeStr = CodeUtil.getcode();
        //��������
        rightCode.setText(codeStr);
        //������¼�
        rightCode.addMouseListener(this);
        //����λ�úͿ��
        rightCode.setBounds(300, 256, 50, 30);
        this.getContentPane().add(rightCode);


        //7.��ӵ�¼ע�ᰴť
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("image\\login\\��¼��ť.png"));
        //ȥ���߿�
        login.setBorderPainted(false);
        //ȥ������
        login.setContentAreaFilled(false);
        //����¼��ť������¼�
        login.addMouseListener(this);
        this.getContentPane().add(login);

        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("image\\login\\ע�ᰴť.png"));
        //ȥ���߿�
        register.setBorderPainted(false);
        //ȥ������
        register.setContentAreaFilled(false);
        //����¼��ť������¼�
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //��ӱ���ͼƬ
        JLabel background = new JLabel(new ImageIcon("image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

        //ˢ��һ�½���
        this.getContentPane().repaint();
    }

    //��ʼ������
    private void initJFrame() {
        //����һ����¼����,���ÿ��
        this.setSize(488, 430);
        this.setVisible(true);
        //���ý���ı���
        this.setTitle("ƴͼ ��¼");
        //���ý����ö�
        this.setAlwaysOnTop(true);
        //���ý������
        this.setLocationRelativeTo(null);
        //������Ϸ�Ĺر�ģʽ
        this.setDefaultCloseOperation(3);//WindowConstants.EXIT_ON_CLOSE
        //ȡ��Ĭ�ϵľ��з���,�������ܰ���xy��ķ�ʽ������
        this.setLayout(null);
    }

    //�ж��û���Ϣ�Ƿ�������ȷ
    static boolean contains(User userInput){
        for (int i = 0; i < list.size(); i++) {
            //�½��û�����,�õ������е��û�
            User u = list.get(i);
            System.out.println(u.getUsername()+"  "+u.getPassword());
            if (u.getUsername().equals(userInput.getUsername())&&u.getPassword().equals(userInput.getPassword())){
//                System.out.println("true");
                return true;
            }
        }
//        System.out.println("false");
        return false;
    }


    //����¼�
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("����˵�¼��ť");
            //��ȡ�����ı�������е�����
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            //��ȡ�������֤��
            String codeInput = code.getText();

            //����һ��user����
            User userInput = new User(usernameInput, passwordInput);
            System.out.println("�û�������û���Ϊ:" + usernameInput);
            System.out.println("�û����������Ϊ:" + passwordInput);

            if (codeInput.length() == 0) {
                JDialogUtil.showJDialog("��֤�벻��Ϊ��");
            }else if (usernameInput.length()==0||passwordInput.length()==0){
                JDialogUtil.showJDialog("�û����������벻��Ϊ��");
            }else if (!codeInput.equalsIgnoreCase(rightCode.getText())){
                JDialogUtil.showJDialog("��֤���������");
            } else if (contains(userInput)) {
                //��֤�ɹ�
                System.out.println("�û�"+usernameInput+"��¼�ɹ�");
                //�رյ�ǰҳ��
                this.setVisible(false);
                //����Ϸҳ��
                new GameJFrame();

            }else {
                System.out.println("�û������������");
                JDialogUtil.showJDialog("�û������������");
            }
        } else if (e.getSource() == register) {
                System.out.println("�����ע�ᰴť");
                //�رյ�ǰҳ��
                this.setVisible(false);
                //��ע��ҳ��
                new RegisterJFrame();
            } else if (e.getSource() == rightCode) {
                System.out.println("����˸�����֤��");
                String code = CodeUtil.getcode();
                rightCode.setText(code);
            }
        }

    //���²���
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("��¼����");
            login.setIcon(new ImageIcon("image\\login\\��¼����.png"));
        } else if (e.getSource() == register) {
            System.out.println("ע�ᰴ��");
            register.setIcon(new ImageIcon("image\\login\\ע�ᰴ��.png"));
        }

    }

    //�ɿ���ť
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("��¼�ɿ�");
            login.setIcon(new ImageIcon("image\\login\\��¼��ť.png"));
        } else if (e.getSource() == register) {
            System.out.println("ע���ɿ�");
            register.setIcon(new ImageIcon("image\\login\\ע�ᰴť.png"));
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
