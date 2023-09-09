package com.itheima.ui;

import com.itheima.UserInfo.User;
import com.itheima.util.JDialogUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements MouseListener {
    //注册界面

    //用户名\密码输入框
    JTextField username = new JTextField();
    JTextField password= new JTextField();
    JTextField againPassword = new JTextField();

    //注册\重置按钮
    JButton register= new JButton();
    JButton reset= new JButton();


    public RegisterJFrame(){

        //初始化界面
        initJFrame();

        //添加内容
        initView();

        //让界面展示出来
        this.setVisible(true);

    }

    //在初始化界面中添加内容
    private void initView() {
        //清空原本已经出现的图片
        this.getContentPane().removeAll();

        //1.添加注册用户名文字
        JLabel registUsername = new JLabel(new ImageIcon("image\\register\\注册用户名.png"));
        registUsername.setBounds(60, 125,79,17);
        this.getContentPane().add(registUsername);

        //2.添加注册用户名输入框
        username.setBounds(170,120,200,30 );
        this.getContentPane().add(username);

        //3.添加注册密码文字
        JLabel registPassword = new JLabel(new ImageIcon("image\\register\\注册密码.png"));
        registPassword.setBounds(65,185,64,16);
        this.getContentPane().add(registPassword);

        //4.添加注册密码输入框
        password.setBounds(170,180,200,30);
        this.getContentPane().add(password);

        //5.添加再次输入密码文字
        JLabel registerAgainPd = new JLabel(new ImageIcon("image\\register\\注册密码.png"));
        registerAgainPd.setBounds(50,245,96,17);
        this.getContentPane().add(registerAgainPd);

        //6.添加再次输入密码输入框
        againPassword.setBounds(170,240,200,30);
        this.getContentPane().add(againPassword);

        //7.添加注册按钮
        register.setBounds(70,320,128,47);
        register.setIcon(new ImageIcon("image\\register\\注册按钮.png"));
        //去除边框
        register.setBorderPainted(false);
        //去除背景
        register.setContentAreaFilled(false);
        //给注册按钮绑定鼠标按键
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //8.添加重置按钮
        reset.setBounds(270,320,128,47);
        reset.setIcon(new ImageIcon("image\\register\\重置按钮.png"));
        //去除边框
        reset.setBorderPainted(false);
        //去除背景
        reset.setContentAreaFilled(false);
        //给重置按钮绑定鼠标按键
        reset.addMouseListener(this);
        this.getContentPane().add(reset);

        //9.添加背景
        JLabel background = new JLabel(new ImageIcon("image\\register\\background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
        //刷新一下界面
        this.getContentPane().repaint();


    }

    //初始化界面
    private void initJFrame() {
        //创建一个注册界面,设置宽高
        this.setSize(488,430);
        this.setVisible(true);
        //设置界面的标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(3);//WindowConstants.EXIT_ON_CLOSE
        //取消默认的居中放置,这样才能放置组件
        this.setLayout(null);
    }

    //判断用户是否存在
/*    public boolean contains(User userInput){
        for (int i = 0; i < LoginJFrame.list.size(); i++) {
            //新建用户对象,得到集合中的用户
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

    //鼠标点击
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== register){
            System.out.println("点击了注册按钮");
            //拿到输入的用户名 密码 再次输入的密码
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            String againPdInput = againPassword.getText();

            System.out.println(usernameInput);
            System.out.println(passwordInput);
            System.out.println(againPdInput);

            //创建一个user对象
            User userRegister = new User(usernameInput,passwordInput);
            System.out.println("用户注册的用户名为"+userRegister.getUsername());
            System.out.println("用户注册的密码为"+userRegister.getPassword());

            if (usernameInput.length()==0||passwordInput.length()==0){
                JDialogUtil.showJDialog("用户名或者密码不能为空");
            }else if (!passwordInput.equals(againPdInput)){
                //两次输入密码不一致
                JDialogUtil.showJDialog("两次输入密码不一致");
            }else if (LoginJFrame.contains(userRegister)){
                JDialogUtil.showJDialog("该用户已经存在");
            }else{
                //验证成功
                LoginJFrame.list.add(userRegister);
                System.out.println(userRegister.getUsername()+"已经成功注册");
                JDialogUtil.showJDialog("注册成功");

                //关闭当前界面
                this.setVisible(false);

                //返回登录界面
                new LoginJFrame();

/*                //遍历loginJFrame里面的list查看是否添加
                for (int i = 0; i < LoginJFrame.list.size(); i++) {
                    User u = LoginJFrame.list.get(i);
                    System.out.println("用户名为:"+u.getUsername()+"\n密码为:"+u.getPassword());
                }*/
            }

        }else if (e.getSource()== reset){
            System.out.println("点击了重置按钮");
            //重置三个输入框的内容
            username.setText("");
            password.setText("");
            againPassword.setText("");

        }
    }

    //按下不松
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == register){
            System.out.println("按下注册");
            register.setIcon(new ImageIcon("image\\register\\注册按下.png"));
        } else if (e.getSource() == reset) {
            System.out.println("按下重置");
            reset.setIcon(new ImageIcon("image\\register\\重置按下.png"));
        }
    }

    //松开按键
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == register){
            System.out.println("松开注册");
            register.setIcon(new ImageIcon("image\\register\\注册按钮.png"));
        } else if (e.getSource() == reset) {
            System.out.println("松开重置");
            reset.setIcon(new ImageIcon("image\\register\\重置按钮.png"));
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
