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

    //登录\注册按钮
    JButton login = new JButton();
    JButton register = new JButton();

    //用户名 密码 验证码输入框
    JTextField username = new JTextField();
    //JPasswordField 密文输入
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();

    //正确的验证码
    JLabel rightCode = new JLabel();


    //登录界面
    public LoginJFrame() {

        //初始化界面
        initJFrame();

        //初始化图像
        initImage();

        //让界面显示出来,写在最后
        this.setVisible(true);
    }

    //初始化图像
    private void initImage() {
        //清空原本已经出现的图片
        this.getContentPane().removeAll();

        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //5.验证码提示
        JLabel CodeText = new JLabel(new ImageIcon("image\\login\\验证码.png"));
        CodeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(CodeText);

        //6.验证码输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        String codeStr = CodeUtil.getcode();
        //设置内容
        rightCode.setText(codeStr);
        //绑定鼠标事件
        rightCode.addMouseListener(this);
        //设置位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        this.getContentPane().add(rightCode);


        //7.添加登录注册按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        //去除边框
        login.setBorderPainted(false);
        //去除背景
        login.setContentAreaFilled(false);
        //给登录按钮绑定鼠标事件
        login.addMouseListener(this);
        this.getContentPane().add(login);

        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        //去除边框
        register.setBorderPainted(false);
        //去除背景
        register.setContentAreaFilled(false);
        //给登录按钮绑定鼠标事件
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

        //刷新一下界面
        this.getContentPane().repaint();
    }

    //初始化界面
    private void initJFrame() {
        //创建一个登录界面,设置宽高
        this.setSize(488, 430);
        this.setVisible(true);
        //设置界面的标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(3);//WindowConstants.EXIT_ON_CLOSE
        //取消默认的居中放置,这样才能按照xy轴的方式添加组件
        this.setLayout(null);
    }

    //判断用户信息是否输入正确
    static boolean contains(User userInput){
        for (int i = 0; i < list.size(); i++) {
            //新建用户对象,得到集合中的用户
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


    //点击事件
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("点击了登录按钮");
            //获取两个文本输入框中的内容
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            //获取输入的验证码
            String codeInput = code.getText();

            //创建一个user对象
            User userInput = new User(usernameInput, passwordInput);
            System.out.println("用户输入的用户名为:" + usernameInput);
            System.out.println("用户输入的密码为:" + passwordInput);

            if (codeInput.length() == 0) {
                JDialogUtil.showJDialog("验证码不能为空");
            }else if (usernameInput.length()==0||passwordInput.length()==0){
                JDialogUtil.showJDialog("用户名或者密码不能为空");
            }else if (!codeInput.equalsIgnoreCase(rightCode.getText())){
                JDialogUtil.showJDialog("验证码输入错误");
            } else if (contains(userInput)) {
                //验证成功
                System.out.println("用户"+usernameInput+"登录成功");
                //关闭当前页面
                this.setVisible(false);
                //打开游戏页面
                new GameJFrame();

            }else {
                System.out.println("用户名或密码错误");
                JDialogUtil.showJDialog("用户名或密码错误");
            }
        } else if (e.getSource() == register) {
                System.out.println("点击了注册按钮");
                //关闭当前页面
                this.setVisible(false);
                //打开注册页面
                new RegisterJFrame();
            } else if (e.getSource() == rightCode) {
                System.out.println("点击了更换验证码");
                String code = CodeUtil.getcode();
                rightCode.setText(code);
            }
        }

    //按下不松
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("登录按下");
            login.setIcon(new ImageIcon("image\\login\\登录按下.png"));
        } else if (e.getSource() == register) {
            System.out.println("注册按下");
            register.setIcon(new ImageIcon("image\\login\\注册按下.png"));
        }

    }

    //松开按钮
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("登录松开");
            login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        } else if (e.getSource() == register) {
            System.out.println("注册松开");
            register.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        }
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
