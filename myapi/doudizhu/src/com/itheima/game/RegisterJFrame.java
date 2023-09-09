package com.itheima.game;

import com.itheima.domain.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements MouseListener {

    //登录按钮
    JButton login = new JButton();
    //注册按钮
    JButton register = new JButton();

    //用户名输入框
    JTextField registerUsername = new JTextField();
    //密码输入框
    JTextField registerPassword = new JTextField();
    //密码再次输入框
    JTextField againPassword = new JTextField();




    public RegisterJFrame(){
        //初始化界面
        initJFrame();

        //初始化图像
        initView();

        //让界面显示出来
        this.setVisible(true);

    }

    //初始化图形
    private void initView() {

        Font registerFont = new Font(null,1,16);
        //1.添加输入注册用户名
        JLabel usernameText = new JLabel("注册用户名");
        usernameText.setForeground(Color.BLACK);
        usernameText.setFont(registerFont);
        usernameText.setBounds(60,40,100,22);
        this.getContentPane().add(usernameText);

        //2.添加输入框
        registerUsername.setBounds(170,40,200,30);
        this.getContentPane().add(registerUsername);

        //3.添加输入密码
        JLabel passwordText = new JLabel("输入密码");
        passwordText.setFont(registerFont);
        passwordText.setForeground(Color.BLACK);
        passwordText.setBounds(65,90,100,22);
        this.getContentPane().add(passwordText);

        //4.添加密码输入框
        registerPassword.setBounds(170,90,200,30);
        this.getContentPane().add(registerPassword);

        //5.添加再次输入密码
        JLabel againPasswordText = new JLabel("再次输入密码");
        againPasswordText.setFont(registerFont);
        againPasswordText.setForeground(Color.BLACK);
        againPasswordText.setBounds(50,140,120,22);
        this.getContentPane().add(againPasswordText);

        //6.添加再次输入密码框
        againPassword.setBounds(170,140,200,30);
        this.getContentPane().add(againPassword);


        //7.添加注册按钮
        register.setText("注册");
        this.setFont(new Font(null,2,40));
        register.setBounds(70,230,100,50);
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //8.添加返回登录按钮
        login.setText("返回登录");
        this.setFont(new Font(null,1,40));
        login.setBounds(270,230,100,50);
        login.addMouseListener(this);
        this.getContentPane().add(login);



    }

    //初始化界面
    private void initJFrame() {
        //设置大小
        this.setSize(488,430);
        //设置标题
        this.setTitle("斗地主 注册");
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置置顶
        this.setAlwaysOnTop(true);
        //取消默认布局
        this.setLayout(null);
    }

    //创建弹窗对象
    private void showJDialog(String text) {
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        //设置标题
        jDialog.setTitle("登录");
        //设置大小
        jDialog.setSize(200,150);
        //设置置顶
        jDialog.setAlwaysOnTop(true);
        //弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭不能操作其他界面
        jDialog.setModal(true);


        //创建jlabel对象管理文字并且添加到弹框中
        JLabel warning  = new JLabel(text);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);


    }

    //点击事件
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == register){
            System.out.println("在注册页面点击了注册按钮");
            //获取用户输入的数据
            String usernameInput = registerUsername.getText();
            String passwordInput = registerPassword.getText();
            String againPasswordInput = againPassword.getText();

            boolean result = checkRegister(LoginJFrame.allUsers, usernameInput, passwordInput, againPasswordInput);
            if (!result){
                //注册不成功
                return;
            }
            //注册成功
            showJDialog("注册成功");

        } else if (e.getSource() == login) {
            System.out.println("在注册界面点击了返回登录按钮");
            //关闭当前页面,返回登录界面
            this.setVisible(false);
            new LoginJFrame();

        }
    }

    //检查用户是否能注册成功
    private boolean checkRegister(ArrayList<User> allUsers, String usernameInput, String passwordInput, String againPasswordInput) {
        //长度不能小于3
        if (usernameInput.length() <3|| passwordInput.length() <3){
            showJDialog("用户名或者密码长度不能小于3");
            return false;
        }
        //长度不能大于10
        if (usernameInput.length()>10|| passwordInput.length()>10){
            showJDialog("用户名或者密码长度不能大于10");
            return false;
        }
        //验证两次输入的密码
        if (!passwordInput.equals(againPasswordInput)){
            showJDialog("两次输入的密码不一致");
            return false;
        }
        //验证用户名和密码是否合法
        String regexUsername = "[\\w]{3,10}";
        boolean matchesUsername = usernameInput.matches(regexUsername);

        String regexPassword = "[\\d]{3,10}";
        boolean matchesPassword = passwordInput.matches(regexPassword);

        if (!matchesUsername||!matchesPassword){
            showJDialog("用户名或者密码格式不正确");
            return false;
        }else {
            //验证成功,加入到allUsers里面去
            User newUser = new User(usernameInput,passwordInput);
            allUsers.add(newUser);
            return true;
        }
    }

    //按下不松
    @Override
    public void mousePressed(MouseEvent e) {

    }

    //松开
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    //鼠标移入
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    //鼠标移出
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
