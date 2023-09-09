package com.itheima.game;

import com.itheima.domain.User;
import com.itheima.util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {

    static ArrayList<User> allUsers = new ArrayList<>();

    static {
        allUsers.add(new User("zhangsan","123"));
        allUsers.add(new User("lisi","1234"));
/*        User u1 = new User("zhangsan","123");
        boolean contains = allUsers.contains(u1);
        System.out.println(contains);*/
    }

    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();


    //正确的验证码
    JLabel rightCode = new JLabel();


    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //初始化组件,在这个界面中添加内容
        initview();

        //让当前界面显示出来
        this.setVisible(true);
    }

    //初始化图形界面,显示出来
    private void initview() {
        //1.添加用户名文字
        Font usernameFont = new Font(null,1,16);
        JLabel usernameText = new JLabel("用户名");
        usernameText.setForeground(Color.white);
        usernameText.setFont(usernameFont);
        usernameText.setBounds(140,55,55,22 );
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(223,46,200,30);
        this.getContentPane().add(username);


        //1.添加密码文字
        Font passwordFont = new Font(null,1,16);
        JLabel passwordText = new JLabel("密码");
        passwordText.setForeground(Color.white);
        passwordText.setFont(passwordFont);
        passwordText.setBounds(197,95,40,22 );
        this.getContentPane().add(passwordText);

        //2.添加密码输入框
        password.setBounds(263,87,160,30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel("验证码");
        Font codeFont = new Font(null,1,16);
        codeText.setForeground(Color.white);
        codeText.setFont(codeFont);
        codeText.setBounds(215,142,55,22);
        this.getContentPane().add(codeText);


        //验证码输入框
        code.setBounds(291, 133, 100, 30);
        this.getContentPane().add(code);

        //获取正确的验证码
        String codeStr = CodeUtil.getCode();
        Font rightCodeFont = new Font(null,1,15);
        //设置颜色
        rightCode.setForeground(Color.red);
        //设置字体
        rightCode.setFont(rightCodeFont);
        //设置内容
        rightCode.setText(codeStr);
        //绑定鼠标事件
        rightCode.addMouseListener(this);
        //位置和宽高
        rightCode.setBounds(400, 133, 100, 30);
        //添加到界面
        this.getContentPane().add(rightCode);


        //5.增加登录按钮
        login.setBounds(143,310,128,47);
        login.setIcon(new ImageIcon("doudizhu\\image\\login\\登录按钮.png"));
        //去除边框
        login.setBorderPainted(false);
        //去除背景
        login.setContentAreaFilled(false);
        //绑定鼠标按键
        login.addMouseListener(this);
        this.getContentPane().add(login);

        //6.增加注册按钮
        register.setBounds(380,310,128,47);
        register.setIcon(new ImageIcon("doudizhu\\image\\login\\注册按钮.png"));
        //去除边框
        register.setBorderPainted(false);
        //去除背景
        register.setContentAreaFilled(false);
        //绑定鼠标事件
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //7.添加背景
        JLabel background = new JLabel(new ImageIcon("doudizhu\\image\\login\\background.png"));
        background.setBounds(0,0,633,423);
        this.getContentPane().add(background);


    }

    //初始化界面设置
    private void initJFrame() {
        //设置宽高
        this.setSize(635,423 );
        //设置标题
        this.setTitle("斗地主游戏 V1.0 登录");
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置置顶
        this.setAlwaysOnTop(true);
        //取消默认布局
        this.setLayout(null);



    }


    private boolean userConstains(String usernameInput, String passwordInput,String codeInput) {
        //判断验证码长度
        if(codeInput.length()==0){
            showJDialog("验证码不能为空");
            return false;
        }
        //判断用户名和密码不为空
        if (usernameInput.length()==0||passwordInput.length()==0){
            showJDialog("用户名和密码不能为空");
            return false;
        }
        //判断验证码是否正确
        if(!codeInput.equalsIgnoreCase(rightCode.getText())){
            showJDialog("验证码输入错误");
            return false;
        }

        //判断集合中是否包含当前用户对象,contains依赖的equals方法,所以要重写equals方法
        User userInfo = new User(usernameInput,passwordInput);
        System.out.println(allUsers);
        System.out.println(usernameInput);
        System.out.println(passwordInput);
        if (allUsers.contains(userInfo)){
            //存在
            return true;
        }else {
            showJDialog("用户名或者密码错误");
            return false;
        }
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


    //点击
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==login){
            System.out.println("在登录界面点击了登录按钮");
            //得到用户输入的用户名和密码
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            //得到用户输入的验证码
            String codeInput = code.getText();

/*            //判断验证码长度
            if(codeInput.length()==0){
                showJDialog("验证码不能为空");
                return;
            }
            //判断用户名和密码不为空
            if (usernameInput.length()==0||passwordInput.length()==0){
                showJDialog("用户名和密码不能为空");
                return;
            }
            //判断验证码是否正确
            if(!codeInput.equalsIgnoreCase(rightCode.getText())){
                showJDialog("验证码输入错误");
                return;
            }

            //判断集合中是否包含当前用户对象,contains依赖的equals方法,所以要重写equals方法
            User userInfo = new User(usernameInput,passwordInput);
            if (allUsers.contains(userInfo)){
                //存在
                return;
            }else {
                showJDialog("用户名或者密码错误");
                return;
            }*/


            boolean loginSuccess = userConstains(usernameInput, passwordInput, codeInput);
            System.out.println(loginSuccess);
            //判断用户登录是否成功
            if (loginSuccess){
                System.out.printf("用户名为: %s 的用户登录成功",usernameInput);
                //成功 关闭当前页面
                this.setVisible(false);
                //打开游戏主页面
                new GameJFrame();
            }else {
                return;
            }
        } else if (e.getSource()==register) {
            System.out.println("在登录界面点击了注册按钮");
            //跳转到注册界面
            new RegisterJFrame();
            //关闭当前页面
            this.setVisible(false);

        } else if (e.getSource()==rightCode) {
            System.out.println("点击了更换验证码");
            //获取一个新的验证码
            String code = CodeUtil.getCode();
            rightCode.setText(code);
            
        }
    }

    //鼠标按下
    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == login){
            login.setIcon(new ImageIcon("doudizhu\\image\\login\\登录按下.png"));
        }else if (e.getSource()==register){
            register.setIcon(new ImageIcon("doudizhu\\image\\login\\注册按下.png"));
        }

    }

    //鼠标松开
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login){
            login.setIcon(new ImageIcon("doudizhu\\image\\login\\登录按钮.png"));
        }else if (e.getSource()==register){
            register.setIcon(new ImageIcon("doudizhu\\image\\login\\注册按钮.png"));
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
